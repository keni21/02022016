package MayBe;

public class MayBe<T> {
	
	private T Data;
	private int status;
	
	public MayBe(T data, int status) {
		super();
		Data = data;
		this.status = status;
	}

	public void setData(T data) {
		Data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static final int Zugrifferlaubt=1;  // fragen was das final bedeutet
	public static final int Zugriffnichterlaubt=2;
	public static final int KeineDaten=3;
	
	public void printData()
	{
		switch (status) {
		case Zugrifferlaubt:System.out.println("zugrif erlaubt "+Data);
			
			break;

		case Zugriffnichterlaubt: System.out.println("nix geta");
			
			break;
			
		case KeineDaten:System.out.println("nix data da");
	
	break;
	
		default:
			break;
		}
	}
	
	

}
