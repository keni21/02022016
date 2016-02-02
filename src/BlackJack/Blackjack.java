package BlackJack;

import java.util.HashMap;


public class Blackjack {
	
	private HashMap<Player, Integer> players=new HashMap<>();
	
	public boolean add(Player player)
	{
		if (players.containsKey(player))
		{
			return false;
		}
		else 
		{
			players.put(player, 0);
			return true;
		}
	}

	public boolean addcard(Player player, Integer cardValue)
	{
		if (players.containsKey(player))
		{
			Integer currentValue = players.get(player); // wann verwendet man einen großen Integer
			players.put(player,currentValue+cardValue);
			return true;
		}
		return false;
	}
	
	public Integer getValue(Player player)
	{
		return players.get(player);
	}

	public String toString() 
	{ 
		String result = ""; 
		for(Player p : players.keySet()) 
		{ 
			result += p.getName()+ ", Kartenwert: "+players.get(p)+"\n"; 
		} 
		 		return result; 
	 } 

	
	
}
