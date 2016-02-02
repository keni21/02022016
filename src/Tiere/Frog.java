package Tiere;

public class Frog extends Animal {

	public Frog(String color, int countEyes) {
		super(color, countEyes);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void walk() {
		System.out.println("jumping");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Quack");
	}

}
