package Konto;

public class GiroKonto extends Konto
{
	protected double limit;

	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
	}
	
	@Override
	public void einzahlen(double wert) {		
		super.einzahlen(wert);
	}
	
	@Override
	public void auszahlen(double wert) {
		if (kontostand-wert>=(limit*-1))
		{
			super.auszahlen(wert);
		}
		
	}

}
