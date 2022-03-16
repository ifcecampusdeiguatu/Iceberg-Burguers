package br.com.icebergburguers.icebergburguers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class routesController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("name") String name) {
		
		return "pages/search";
	}
}
