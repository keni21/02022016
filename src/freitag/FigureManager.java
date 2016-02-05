package freitag;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	private ArrayList<Figure>figuren=new ArrayList<>();
	
	public void add(Figure f)
	{
		figuren.add(f);
	}
	
	public double getMaxPerimeter()
	{
		double max=0.0;
		
		for (Figure figure : figuren) {
			if(figure.getPerimeter()>=max)
			{
				max=figure.getPerimeter();
			}
		}
		return max;
	}

	public double getAverageAreaSize()
	{
		double sum=0.0;
		for (Figure figure : figuren) {
			sum+=figure.getArea();
		}
		return sum/figuren.size();
	}
	
	public HashMap<String, Double>getAreaBySieCategories()
	{
		for (Figure figure : figuren) {
			System.out.println(figure.getArea());
		}
		
		
		HashMap<String, Double>map=new HashMap<>();
		map.put("Klein", 0.0);
		map.put("Mittel", 0.0);
		map.put("Gross", 0.0);
		
		for (Figure figure : figuren) 
		{
			if(figure.getArea()<1000)
			{
				Double value=map.get("Klein");
				map.put("Klein", value+1);
			}
			if(figure.getArea()>1000&&figure.getArea()<5000)
			{
				Double value=map.get("Mittel");
				map.put("Mittel", value+1);
			}
			if(figure.getArea()>=5000)
			{
				Double value=map.get("Gross");
				map.put("Gross", value+1);
			}			
		}
		return map;
	}
}
