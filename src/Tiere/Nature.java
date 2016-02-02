package Tiere;

import java.awt.List;
import java.util.ArrayList;

public class Nature {
	
	ArrayList<Animal> list =new ArrayList<>();

	public Nature(ArrayList<Animal> list) {
		super();
		this.list = list;
	}
	
	public void addAnimal(Animal a){
		list.add(a);
	}

	public int countColor(String color)
	{
		int count=0;
		for (Animal animal : list) 
		{
			if(animal.color.equals(color))
			{
				count++;
			}
			
		}
		return count;
	}
}
