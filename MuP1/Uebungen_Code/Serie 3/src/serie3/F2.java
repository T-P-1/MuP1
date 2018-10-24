package serie3;

import java.util.ArrayList;

public class F2 {
	private ArrayList<String[]> db;
	
	/**
	 * Initialisiert Funktion 2
	 * @param datenbank Übergebene Datenbank
	 */
	public F2(String[][] datenbank){
		db = new ArrayList<String[]>();
		for(String[] eintrag : datenbank){
			db.add(eintrag);
		}
	}
	
	
	public ArrayList<String[]> sortieren(){
		ArrayList<String[]> db = new ArrayList<String[]>();
		db.addAll(this.db);
		ArrayList<String[]> sortedList = new ArrayList<String[]>();
		ArrayList<String[]> jahrliste = new ArrayList<String[]>();
		ArrayList<String[]> monatliste = new ArrayList<String[]>();
		
		int counter = 0;
		int jahr = 2010;
		int monat = 1;
		int tag = 1;
		
		//Sortierung nach Jahr
		while(!db.isEmpty()){
			if(Integer.parseInt(db.get(counter)[1]) == jahr){
				jahrliste.add(db.get(counter));
				db.remove(counter);
			}
			else{
				counter++;
			}
			//Am Ende angekommen: Counter zurücksetzen und nächstes Jahr zu jahrliste hinzufügen
			if(counter == db.size()){
				counter = 0;
				jahr++;
			}
		}
		jahr = 2010;
		//Sortierung nach Monat
		while(!jahrliste.isEmpty()){
			
			if(Integer.parseInt(jahrliste.get(counter)[1]) == jahr 
			&& Integer.parseInt(jahrliste.get(counter)[2]) == monat){
				monatliste.add(jahrliste.get(counter));
				jahrliste.remove(counter);
			}
			else{
				counter++;
			}
			//Am Ende angekommen: Counter zurücksetzen und nächsten Monat zu monatliste hinzufügen
			if(counter == jahrliste.size()){
				counter = 0;
				monat++;
			}
			if(monat == 13){
				monat = 1;
				jahr++;
			}
		}
		monat = 1;
		jahr = 2010;
		//Sortierung nach Tag
		while(!monatliste.isEmpty()){
			if(Integer.parseInt(monatliste.get(counter)[1]) == jahr 
			&& Integer.parseInt(monatliste.get(counter)[2]) == monat
			&& Integer.parseInt(monatliste.get(counter)[3]) == tag){
				sortedList.add(monatliste.get(counter));
				monatliste.remove(counter);
			}
			else{
				counter++;
			}
			//Am Ende angekommen: Counter zurücksetzen und nächsten Tag zu sortedList hinzufügen
			if(counter == monatliste.size()){
				counter = 0;
				tag++;		
			}
			if(tag == 32){
				tag = 1;
				monat++;
			}
			if(monat == 13){
				monat = 1;
				jahr++;
			}
			
		}
		return sortedList;
		
	}
	
	public void ausgabe(ArrayList<String[]> liste){
		for(int i=0; i<liste.size(); i++){
			for(int j=0; j<liste.get(i).length; j++){
				System.out.print(liste.get(i)[j] + " | ");
			}
			System.out.println("");
		}
	}
}
