package FigurenUebungsabend;

public class Demo {

	public static void main(String[] args) {
		
		Rectangle Figur1 =new Rectangle(10, 20);
		Rectangle Figur2 =new Rectangle(100, 20);
		Rectangle Figur3 =new Rectangle(100, 50);
		Rectangle Figur4 =new Rectangle(100, 100);
		Circle Figur5=new Circle(10);
		Circle Figur6=new Circle(100);
		Circle Figur7=new Circle(1000);
		
		FigureManager manager=new FigureManager();
		
		manager.add(Figur1);
		manager.add(Figur2);
		manager.add(Figur3);
		manager.add(Figur4);
		manager.add(Figur5);
		manager.add(Figur6);
		manager.add(Figur7);
		
		System.out.println(manager.getMaxPerimeter());
		System.out.println(manager.getAverageArea());
		System.out.println(manager.getAreaBySizeCategorie());

		

	}

}
