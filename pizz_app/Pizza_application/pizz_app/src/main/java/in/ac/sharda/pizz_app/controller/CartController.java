package in.ac.sharda.pizz_app.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizz_app.domain.Product;
//4.) CREATED A REST CONTROLLER 

@RestController

public class CartController {
	// 5.) ADDED A LIST OF CART HAVING PRODUCT
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		this.products.add(product);
	}
	//*** 6.) ADDED A BEHAVIOUR MAPPING IN CARTCONTROLLER TO REMOVE ITEMS FROM THE CART
	@GetMapping("/remove/list")
	public void removeProduct(Product product)
	{
		this.products.remove(product);
	}

	@GetMapping("/count/list")
	public int count()
	{
		// 7.) COUNT ITEMS IN CART
		return this.products.size();
	}
	
}  

