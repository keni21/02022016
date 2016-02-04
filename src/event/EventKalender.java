package event;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
	
	private ArrayList<Event>events=new ArrayList<>();
	
	public void add(Event e)
	{
		events.add(e);
	}
	
	public Event getByTitle(String title)
	{
		Event uebergabe=null;
		for (Event event : events) {
			if(event.getTitle().equals(title))
			{
				uebergabe=event;
			}
		}
		return uebergabe;
	}
	
	public ArrayList<Event> getByOrt (String ort)
	{
		ArrayList<Event>orte=new ArrayList<>();
		
		for (Event event : events) {
			if(event.getOrt().equals(ort))
			{
				orte.add(event);
			}
		}
		return orte;
	}
	
	public ArrayList<Event> getbyEintrittdPreis(double min, double max)
	{
		ArrayList<Event>between= new ArrayList<>();
		for (Event event : events) {
			if(event.getEintrittspreis()>min&& event.getEintrittspreis()<max)
			{
				between.add(event);
			}
		}
		return between;
	}
	
	public ArrayList<Event>getMostExpensive(String ort)
	{
		double preis=0.0;
		ArrayList<Event>Expensive=new ArrayList<>();
		Event max=null;
		for (Event event : events) 
		{
			if(event.getOrt().equals(ort))
			{
				
				if(event.getEintrittspreis()>=preis)
				{
				preis=event.getEintrittspreis();
				max=event;
				}
				
			}
		}
		Expensive.add(max);
		return Expensive;
	}
	
	public double getAvgPreisByOrt(String ort)
	{
		double value=0.0;
		int count=0;
		for (Event event : events) 
		{
			if(event.getOrt().equals(ort))
			{
			value+=event.getEintrittspreis();
			count++;
			}
			
		}
	return value/count;
	}
	
	public HashMap<String, Integer>getCountByOrt()
	{
		HashMap<String, Integer>map=new HashMap<>();
		
		for (Event event : events) 
		{
			if(!map.containsKey(event.getOrt()))
			{
				map.put(event.getOrt(), 0);
			}
			
			if(map.containsKey(event.getOrt()))
			{
				Integer value=map.get(event.getOrt());
				map.put(event.getOrt(), value+1);
			}
		}
		return map;
	}
}
