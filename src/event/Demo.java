package event;

public class Demo {

	public static void main(String[] args) {


		Event ort1=new Event("Veranstaltung1", "Ort1", 20);
		Event ort2=new Event("Veranstaltung2", "Ort2", 50);
		Event ort3=new Event("Veranstaltung3", "Ort2", 30);
		Event ort4=new Event("Veranstaltung4", "Ort2", 10);
		Event ort5=new Event("Veranstaltung5", "Ort3", 20);
		Event ort6=new Event("Veranstaltung6", "Ort4", 50);
		Event ort7=new Event("Veranstaltung7", "Ort4", 20);

		EventKalender cal=new EventKalender();
		cal.add(ort1);
		cal.add(ort2);
		cal.add(ort3);
		cal.add(ort4);
		cal.add(ort5);
		cal.add(ort6);
		cal.add(ort7);
		
		System.out.println(cal.getByTitle("Veranstaltung2"));
		System.out.println(cal.getByOrt("Ort2"));
		System.out.println(cal.getbyEintrittdPreis(29, 50));
		System.out.println(cal.getMostExpensive("Ort2"));
		System.out.println(cal.getAvgPreisByOrt("Ort2"));
		System.out.println(cal.getCountByOrt());
		
	}

}
