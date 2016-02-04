package Generics;


public class MayBe<T> {
	
	private T data;
	private int status;
	
	
	public MayBe(T data, int status) {
		super();
		this.data = data;
		this.status = status;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}
	
	
	public static final int zugrifferlaubt=1;
	public static final int zugriffverboten=2;
	public static final int keinedaten=3;
	@Override
	public String toString()
	{
		switch (status) {
		case zugrifferlaubt: 
			return "Zugriff erlaubt " +data;
			
		case zugriffverboten:
			return "Zugriff verboten " +data;
		
		case keinedaten: 
			return "keine Daten " +data;

		default:
			return "nix geta";
		}
	}

	
	
}
