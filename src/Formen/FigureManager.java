package Formen;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	private ArrayList<Figure> Figuren= new ArrayList<>();
	
	public void add(Figure f)
	{
		Figuren.add(f);
	}
	
	public double getMaxPerimeter()
	{
		double value=0.0;
		for (Figure figure : Figuren) {
			if( figure.getPerimeter()>value)
			{
				value=figure.getPerimeter();
			}
		}
		return value;
	}

	public double getAverageAreaSize()
	{
		int count=0;
		double value=0.0;
		for (Figure figure : Figuren) {
			value+=figure.getArea();
			count++;
		}
		return value/count;
	}
	
	public HashMap<String, Double> getAreaBySizeCategories()
	{
		HashMap<String, Double>map=new HashMap<>();
		map.put("Klein", 0.0);
		map.put("Mittel", 0.0);
		map.put("Groﬂ",0.0);
		
		for (Figure figure : Figuren) 
		{
			
			if(figure.getArea()<1000)
			{
				Double value= map.get("Klein");// Bei HashMap wird der Wert immer durch das Deklarieren des Wertes und get Key definiert
				map.put("Klein", value+figure.getArea());
			}
			if(figure.getArea()>=1000 && figure.getArea()<=4999)
			{
				Double value= map.get("Mittel");
				map.put("Mittel", value+figure.getArea());
			}
			if(figure.getArea()>=5000)
			{
				Double value= map.get("Groﬂ");
				map.put("Groﬂ", value+figure.getArea());
			}
			
		}return map;
		
	}
}
