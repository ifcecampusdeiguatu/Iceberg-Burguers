package br.com.icebergburguers.icebergburguers.controller;

import br.com.icebergburguers.icebergburguers.api.Api;
import br.com.icebergburguers.icebergburguers.api.Product;
import br.com.icebergburguers.icebergburguers.api.Categories;
import br.com.icebergburguers.icebergburguers.model.CartModel;
import br.com.icebergburguers.icebergburguers.model.ProductModel;
import com.google.gson.Gson;
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
                boolean checkIfCategoryExist = false;
            
		ProductModel product = new ProductModel();
                model.addAttribute("product", product);
                
                String filename="src/main/java/br/com/icebergburguers/icebergburguers/api/products.json";
                Path path = Paths.get(filename);
                
                String json = String.join(" ", Files.readAllLines(path.toAbsolutePath(), StandardCharsets.UTF_8));
                Gson gson = new Gson();
                Api data = gson.fromJson(json, Api.class);
                
                List<Product> dataProducts = new ArrayList<>();
                
                for(Categories category: data.getListCategories()){
                    if(category.getTitle().toLowerCase().equals(name.toLowerCase())){
                        for(Product productInCategory: category.getListProducts() ){
                            dataProducts.add(productInCategory);
                        }
                        checkIfCategoryExist = true;
                    }
                }
                
                if(checkIfCategoryExist){
                    model.addAttribute("listProducts", data.getListCategories());
                    model.addAttribute("dataProducts", dataProducts);


                    CartModel cart = new CartModel();
                    model.addAttribute("cart",cart);
                    
                    return "pages/search";
                }else{
                    return "pages/404";
                }
	}
}
