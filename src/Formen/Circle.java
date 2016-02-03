package Formen;

public class Circle extends Figure {
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	@Override
	public double getArea() {
		return (radius*radius)*Math.PI;
	}
	
	

}
