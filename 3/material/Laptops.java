package material;

import stock.*;

public class Laptops extends Inventory {
	public String name;
	public int qty=0;

	public Laptops(String name, double price, int productid) {
		super();
		this.name = name;
		
		this.price = price;
		this.productid = productid;
		qty++;
	}

	

	

	public double price;

	public int productid = 0;

	public Laptops() {
		// TODO Auto-generated constructor stub
	}

}
