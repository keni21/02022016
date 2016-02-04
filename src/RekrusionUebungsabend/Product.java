package RekrusionUebungsabend;

import java.util.ArrayList;

public class Product {
	
	public String name;
	public ArrayList<Product>Parts=new ArrayList<>();
	public double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void add(Product p)
	{
		Parts.add(p);
	}
	
	public double getPrice()
	{	
		double value=price;
		for (Product product2 : Parts) {
			value+=product2.getPrice();
		}
		
		return value;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", Parts=" + Parts + ", price=" + price + "]";
	}

	public String preis(String indent)
	{
		String name1=indent+ name+"\n";
		String intend2=indent+indent;
		for (Product product2 : Parts) 
		{
			name1+=product2.preis("-"+intend2);
		}
		return name1;
	}
	
	
}
