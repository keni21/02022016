package RekrusionUebungsabend;

public class Demo {

	public static void main(String[] args) {
		
	
	Product mainboard=new Product("glas", 5);
	mainboard.add(new Product("RAM", 10));
	mainboard.add(new Product("CPU", 5));
	
	Product mac=new Product("Mac", 10);
	mac.add(new Product("screen",8));
	mac.add(new Product("keyboard",12));
	
	System.out.println("Produktionskosten: "+mac.getPrice());
	System.out.println("Verkaufspreis: "+mac.getPrice()*100);
	System.out.println(mac.preis(">"));


	}

}
