package in.ac.sharda.pizz_app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//THIS IS CONTROLLER 

import in.ac.sharda.pizz_app.domain.Product;
@RestController
public class ProductListController {
	
	@GetMapping("/product/list")
	public List<Product> products() 
	{
		List<Product> products = new ArrayList<Product>();
		for (int i = 0; i < 20; i++) {
			products.add(new Product(i,i*10,"Name" +i,"Desc" +i));
			
		}
		return products;
		
	}
	

}
