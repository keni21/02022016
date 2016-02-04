package Konto;

public class Demo {

	public static void main(String[] args) {
		
		Konto max=new Konto("Max Muster1");
		GiroKonto peo1=new GiroKonto("Max Muster", 1000);
		JugendKonto peo2= new JugendKonto("Max Muster2", 1000, 100);
		Sparkonto peo3=new Sparkonto("Max Muster2");
		Sparkonto peo4=new Sparkonto("Max Muster3");
		JugendKonto peo5= new JugendKonto("Max Muster3", 1000, 100);
		
		peo1.einzahlen(200);
		peo1.auszahlen(150);
		System.out.println("______________________");
		
		peo2.einzahlen(300);
		peo2.auszahlen(99);
		
		System.out.println("_____________________");
		
		peo3.einzahlen(1000);
		peo3.auszahlen(1001);
		
		Konto casten= peo2;
		GiroKonto jugk= peo2;
		casten=peo2;

		casten.auszahlen(200);
		
		KontoManager manager=new KontoManager();
		manager.add(peo1);
		manager.add(peo2);
		manager.add(peo3);
		manager.add(peo4);
		manager.add(peo5);
		
		System.out.println(manager.getKontoZahl());
	}

}
