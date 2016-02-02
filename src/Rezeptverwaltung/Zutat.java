package Rezeptverwaltung;

public class Zutat {
	String Name;
	int Menge;
	
	public Zutat(String Name, int Menge)
	{
		this.Name=Name;
		this.Menge=Menge;
	}

	public String getName() {
		return Name;
	}

	public int getMenge() {
		return Menge;
	}
	
	

}
