package Konto;

public class Konto {
	
	protected String inhaber;
	protected double kontostand;
	
	public Konto(String inhaber) {
		super();
		this.inhaber = inhaber;
		kontostand=0.0;
	}
	

	public void einzahlen(double wert)
	{
		System.out.println(kontostand+=wert);
	}
	public void auszahlen(double wert)
	{
		System.out.println(kontostand-=wert);
	}


	@Override
	public String toString() {
		return "Konto [inhaber=" + inhaber + ", kontostand=" + kontostand + "]";
	}
	
	
	

}
