package br.com.icebergburguers.icebergburguers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.icebergburguers.icebergburguers.model.CartModel;

@Controller
public class CartController {
	@PostMapping("/cart")
	public String routeCart (@ModelAttribute CartModel cart) {
		
		return "pages/cart";
	}
}
