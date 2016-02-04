package Konto;

public class JugendKonto extends GiroKonto
{	
	public double buchungslimit;

	public JugendKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}
	
	@Override
	public void einzahlen(double wert) {
		// TODO Auto-generated method stub
		super.einzahlen(wert);
	}
	
	@Override
	public void auszahlen(double wert) {
		// erbt das jetz von giro oder von konto
		if(buchungslimit>=wert)
		{
		super.auszahlen(wert);
		}
		else{
			System.out.println("keine auszahlung möglich");
		}
	}
}
