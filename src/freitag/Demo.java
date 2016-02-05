package freitag;

public class Demo {

	public static void main(String[] args) {

		Rectangle rechteck=new Rectangle(100, 200);
		Circle kreis=new Circle(300);
		
		System.out.println(rechteck.getArea());
		System.out.println(rechteck.getPerimeter());
		System.out.println("__________________________________________");
		System.out.println(kreis.getArea());
		System.out.println(kreis.getPerimeter());
		System.out.println("__________________________________________");
		FigureManager manager=new FigureManager();
		
		manager.add(kreis);
		manager.add(rechteck);
		
		System.out.println(manager.getAreaBySieCategories());
		System.out.println(manager.getMaxPerimeter());

	}

}
