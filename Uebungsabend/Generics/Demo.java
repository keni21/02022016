package Generics;

public class Demo {

	public static void main(String[] args) {

		MayBe<Integer> alter= new MayBe<Integer>(26, 1);
		alter.toString();
		
		MayBe<String>value= new MayBe<String>("Klaus", 3);
		System.out.println(value);	

	}

}
