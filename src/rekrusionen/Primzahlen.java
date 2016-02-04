package rekrusionen;

public class Primzahlen {

	public static void main(String[] args) {
		
		int start=6;
		int count=2;
		
		System.out.println(Primz(start, count));

		
	}
	
	public static boolean Primz (int zahl, int count)
	{
		if(count==(zahl/2))
		{
			return true;
		}
		if(zahl%count==0)
		{
			return false;
		}
		return Primz(zahl, (count+1));
		
	}

}
