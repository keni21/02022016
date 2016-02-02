package Tiere;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Frog Frosch=new Frog("green", 2);
		Frosch.makeNoise();
		Frog Froschi=new Frog("blue", 2);
		Froschi.makeNoise();
		
		ArrayList<Animal> List=new ArrayList<>();
		
		Nature myNature=new Nature(List);
		
		myNature.addAnimal(Froschi);
		
		System.out.println(myNature.countColor("blue"));
		

	}

}
