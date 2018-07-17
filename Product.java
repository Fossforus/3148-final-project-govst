// Code written by Fayzulla and Walter
public class Product {
	protected String name, description, size;
	protected double price;
	protected int quantity;
	
public Product(String aName, String aDescription, String aSize, double aPrice, int aQuantity) {
	name = aName;
	description = aDescription;
	size = aSize;
	price = aPrice;
	quantity = aQuantity;
}
	
	public String getName () {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public String getDescription () {
		return description;
	}
		
	public void setDescription(String aDescription) {
			description = aDescription;
	}
	public String getSize () {
		return size;
	}
	
	public void setSize(String aSize) {
		size = aSize;
	}
	public double getPrice () {
		return price;
	}
	public void setPrice(double aPrice) {
		price = aPrice;
	}
	
	public int getQuantity () {
		return quantity;
	}
	public void setQuantity(int aQuantity) {
		quantity = aQuantity;
	}
	
}