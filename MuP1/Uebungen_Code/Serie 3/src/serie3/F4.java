package serie3;

import java.util.ArrayList;

public class F4{
	private ArrayList<String[]> db;
	
	/**
	 * Initialisiert Funktion 4
	 * @param datenbank Übergebene Datenbank
	 */
	public F4(String[][] datenbank){
		db = new ArrayList<String[]>();
		for(String[] eintrag : datenbank){
			db.add(eintrag);
		}
	}
	
	/**
	 * Gibt alle Naturkatastrophen des Jahres 2012 aus, bei denen es keine Opfer gab.
	 * @param jahr Jahr der Naturkatastrophe
	 * @param opfer Anzahl der Opfer
	 */
	public void ausgabe(int jahr, int opfer){
		for(int i=0; i<this.db.size(); i++){
			if(Integer.parseInt(this.db.get(i)[1]) == jahr && Integer.parseInt(this.db.get(i)[7]) == opfer){
				for(int j=1; j<this.db.get(i).length; j++){
					System.out.print(this.db.get(i)[j] + " | ");
				}
			}
		}
	}
}
