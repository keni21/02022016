package maybee;


public class MayBe<T> 
{
	
	private T Data;
	private int status;
	
	public MayBe(T data, int status) {
		super();
		Data = data;
		this.status = status;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public static final int ZugriffErlaubt=1;
	public static final int ZugriffVerboten=2;
	public static final int KeieneDaten=3;
	
	public void Print()
	{
		switch (status) {
		case ZugriffErlaubt:System.out.println("Zugriff erlaubt "+Data);
			
			break;
			
		case ZugriffVerboten:System.out.println("Zugriff verboten");
		
				break;
		
		case KeieneDaten:System.out.println("Zugriff Daten");
		
			break;

		default:
			break;
		}
	}
	

}
