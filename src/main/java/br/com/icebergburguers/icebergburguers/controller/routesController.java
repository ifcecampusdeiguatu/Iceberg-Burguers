package br.com.icebergburguers.icebergburguers.controller;

import br.com.icebergburguers.icebergburguers.api.ApiModel;
import br.com.icebergburguers.icebergburguers.api.Data;
import br.com.icebergburguers.icebergburguers.api.Products;
import br.com.icebergburguers.icebergburguers.model.CartModel;
import br.com.icebergburguers.icebergburguers.model.ProductModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class routesController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/search")
	public String search(Model model, @RequestParam("name") String name) throws IOException {
                boolean checkIfProductExist = false;
            
		ProductModel product = new ProductModel();
                model.addAttribute("product", product);
                
                String filename="src/main/java/br/com/icebergburguers/icebergburguers/controller/products.json";
                Path path = Paths.get(filename);
                String json = String.join(" ", Files.readAllLines(path.toAbsolutePath(), StandardCharsets.UTF_8));
                Gson gson = new Gson();
                ApiModel data = gson.fromJson(json, ApiModel.class);
                
                List<Data> dataProducts = new ArrayList<>();
                
                for(Products prod: data.getListProducts()){
                    if(prod.getTitle().toLowerCase().equals(name.toLowerCase())){
                        for(Data dataProd : prod.getListData() ){
                            dataProducts.add(dataProd);
                        }
                        
                        checkIfProductExist = true;
                    }
                    
                }
                
                if(checkIfProductExist){
                    model.addAttribute("listProducts", data.getListProducts());
                    model.addAttribute("dataProducts", dataProducts);


                    CartModel cart = new CartModel();
                    model.addAttribute("cart",cart);

                    return "pages/search";
                }else{
                    return "pages/404";
                }
	}
}
