package serie3;

public class Main {

	public static void main(String[] args) {
		Verwaltung v = new Verwaltung(NaturkatastrophenDB.getEvents());
		//v.ausgabe(1,3,1.0,7.0);
		v.sortieren();
	}
};
