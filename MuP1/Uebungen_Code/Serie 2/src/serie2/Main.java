package serie2;

public class Main {

	public static void main(String[] args) {
		Flugplanung flugplanung = new Flugplanung("DE-123", "01.01.1970", 5, 15);
		
		flugplanung.buchung(new Passagier("DEFGHXXX", "Max Mustermann"), "economy");
		flugplanung.buchung(new Passagier("ABCDEFXX", "Maria Musterfrau"), "economy");
		flugplanung.buchung(new Passagier("DEFGHXXX", "Max Mustermann"), "economy");
		flugplanung.stornieren("ABCDEFXX");
		flugplanung.upgrade("DEFGHXXX", "economy");
		System.out.println(flugplanung.toString());		
	}

}
