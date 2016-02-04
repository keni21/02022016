package Konto;

import java.util.ArrayList;
import java.util.HashMap;

public class KontoManager {
	
	private ArrayList<Konto>list=new ArrayList<>();
	
	public void add(Konto k)
	{
		list.add(k);
	}
	
	public HashMap<String, Integer> getKontoZahl() {
		HashMap<String, Integer> map=new HashMap<>();
		for (Konto konto : list) 
		{
			if(map.containsKey(konto.inhaber))
			{
				Integer value=map.get(konto.inhaber);
				map.put(konto.inhaber, value+1);
			}
			else
			{
				Integer value=map.get(konto.inhaber);
				map.put(konto.inhaber, 1);
			}
		}
		return map;
		
	}

}
