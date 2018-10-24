package serie3;

public class Main {

	public static void main(String[] args) {
		Verwaltung v = new Verwaltung(NaturkatastrophenDB.getEvents());
		//Methodentest: Funktion 1
		//v.ausgabe(1,3,1.0,7.0);
		
		//Methodentest: Funktion 2
		/*
		for(Naturkatastrophen eintrag : v.sortieren()){
			System.out.println(eintrag.toString());
		}
		*/
		//Methodentest: Funktion 4
		v.ausgabe(2012, 0);
	}
};
