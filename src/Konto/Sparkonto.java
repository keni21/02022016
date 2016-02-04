package Konto;

public class Sparkonto extends Konto 
{

	public Sparkonto(String inhaber) 
	{
		super(inhaber);
		
	}
	
	@Override
	public void einzahlen(double wert) {
		super.einzahlen(wert);
	}
	
	@Override
	public void auszahlen(double wert) {
		if(kontostand-wert<=0)
		{
		System.out.println("keine Auszahlung mehr möglich");	
		}
		else
		{
		super.auszahlen(wert);
		}
	}

}
