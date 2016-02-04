package PromzahlenRekrusion;

public class Primzahlen 
{
	 public int funktion(int n){
		   
		 if (n <= 0) return 0; // Abbruchbedingung
		   
		 else if (n % 2 == 0) 
		{
		return funktion(n - 1); // gerade Zahlen
		}
		else
		{
		return (n + funktion(n - 1)); // ungerade Zahlen
		}
		  }


	
}
