package FigurenUebungsabend;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	private ArrayList<Figure> figuren=new ArrayList<>();
	
	public void add(Figure f)
	{
		figuren.add(f);
	}
	
	public double getMaxPerimeter()
	{
		double value=0.0;
		for (Figure figure : figuren) {
			if(figure.getPerimeter()>value)
			{
				value=figure.getPerimeter();
			}
		}return value;
	}

	public double getAverageArea()
	{
		int i=0;
		double value=0.0;
		
		for (Figure figure : figuren) {
			value+=figure.getArea();
			i++;
		}
		return value/i;
	}
	
	public HashMap<String, Double>getAreaBySizeCategorie()
	{
		HashMap<String, Double>map=new HashMap<String, Double>();
		
		map.put("Klein", 0.0);
		map.put("Mittel",0.0);
		map.put("Gross", 0.0);
		
		for (Figure figure : figuren) {
			if(figure.getArea()<1000)
			{
				Double value=map.get("Klein");
				map.put("Klein", value+figure.getArea());
			}
			if(figure.getArea()>=1000&&figure.getArea()<=5000)
			{
				Double value=map.get("Mittel");
				map.put("Mittel", value+figure.getArea());
			}
			if(figure.getArea()>5000)
			{
				Double value=map.get("Gross");
				map.put("Gross", value+figure.getArea());
			}
		}return map;
	}
	
}
