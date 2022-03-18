package br.com.icebergburguers.icebergburguers.controller;

import br.com.icebergburguers.icebergburguers.model.CartModel;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.icebergburguers.icebergburguers.model.ProductModel;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CartController {
        public List<ProductModel> productsList = new ArrayList<>();
    
	@PostMapping("/cart")
	public String routeCart (Model model, @ModelAttribute ProductModel product, @ModelAttribute CartModel cart) {
            
            productsList.add(product);
            
            cart.setProductList(productsList);
            cart.sumTotal();
            
            model.addAttribute("cart", cart);
            model.addAttribute("products", cart.getProductList());
           
            
            return "pages/cart";
	}
}
