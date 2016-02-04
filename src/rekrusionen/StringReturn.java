package rekrusionen;

public class StringReturn {

	public static void main(String[] args) {

	String satz= "java ist auch eien insel";
	retur(satz);

	}
	
	public static void retur(String satz)
	{
		if(satz.length()>0)
		{
			System.out.print(satz.charAt(satz.length()-1));
			retur(satz.substring(0, satz.length()-1));
		}
	}

}
