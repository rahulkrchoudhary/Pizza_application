package in.ac.sharda.pizz_app.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int id;     //*** 8.) ADDED A STATE ITEM IN THE CART
	private int cartid; //*** 9.) ADDED A STATE THAT MAKES YOUR CART UNIQUE
	// IMPORTED A LIST NAMED AS PRODUCT
	// ...Added a new Array List
	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		this.products.add(product);
	}
	public void removeitem(Product product) {
		this.products.remove(product);   //***10 ADDED A BEHAVIOUR TO REMOVE ITEM  
	}
	public void add(Product product) {
		this.products.add(product);   //***11 ADDED A BEHAVIOUR TO ADD ITEM  
	}
	//*** 12.) ALL POSSIBLE CONSTRUCTORS
	public Cart(int id, int cartid, List<Product> products) {
		super();
		this.id = id;
		this.cartid = cartid;
		this.products = products;
	}
	public Cart(int id)
	{
		this.id = id;
	}
	public Cart(List<Product> products)
	{
		this.products = products;
	}
	public Cart(int id,int cartid)
	{
		this.id = id;
		this.cartid = cartid;		
	}
	public Cart(int id,List<Product> products)
	{
		this.id = id;
		this.products = products;
	}
	
	
	

}
