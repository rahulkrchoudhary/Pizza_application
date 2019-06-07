package in.ac.sharda.pizz_app.domain;

public class Product {

	private final int id;
	private int price,calories;  // 3.) A NEW FEILD NAMED AS CALORIES
	public int getCalories() {
		return calories;
	}
	// 3.) NEW GETTER AND SETTER CREATED
	public void setCalories(int calories) {
		this.calories = calories;
	}


	private String name,description;
	
	// GETTERS AND SETTER BECAUSE "PRIVATE"
	public int getId() {
		return id;
	}
	/*
	***MAKING THIS A COMMENT BECAUSE WE CANNOT MAKE THE SETTER FOR THE FINAL VARIABLES***
	public void setId(int id) {    
		this.id = id;
	}
	*/
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	// ***2.) CREATED A SECOND CONSTRUCTOR WITH ONLY ONE ARGUMENT
	public Product (int id)
	{
		this.id = id;
	}
	
	
	//CONSTRUCTOR AUTO DEFINED..... 
	//THIS CONSTRUCTOR IS USED IN PLACE OF ALL THE SETTERS 
		public Product(int id, int price, String name, String description) {
			super();
			this.id = id;
			this.price = price;
			this.name = name;
			this.description = description;
		}
	
	
	//Equals .....
	@Override
	/* public is a specifier if public then one can import it anywhere
	 boolean is a return type of a function  (TRUE OR FALSE VALUE)
	 OBJECT OBJ is predefined MAJOR CLASS
	 This validation code checks weather the object is in OBJ CLASS OR NOT
	 get id is a function which is made above 
	*/
	public boolean equals(Object obj) {
		//Object is the instance of product
		if(obj!=null && obj instanceof Product)
			return ((Product)obj).getId() == id;
		return false;
	}
}