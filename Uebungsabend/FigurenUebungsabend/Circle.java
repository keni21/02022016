package FigurenUebungsabend;

public class Circle implements Figure
{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		
		return ((2*radius)*Math.PI);
	}

	@Override
	public double getArea() {
		return (Math.pow(radius, 2)*Math.PI);
	}
	
	
	

}
