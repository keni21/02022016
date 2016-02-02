package Rezeptverwaltung;

public class Rezept {
	
	String Name;
	byte Person;
	Zutat[] Zutaten;
	
	public Rezept (String Name, byte Person,Zutat[] Zutaten)
	{
		this.Name=Name;
		this.Person=Person;
		this.Zutaten=Zutaten;
	}

	public String getName() {
		return Name;
	}

	public byte getPerson() {
		return Person;
	}

	public Zutat[] getZutaten() {
		return Zutaten;
	}
	
	public void printRezept()
	{
		for (int i=0; i<Zutaten.length;i++)
		{
			System.out.println(Zutaten[i]+" "+Zutaten[i]);
		}
	}

}
