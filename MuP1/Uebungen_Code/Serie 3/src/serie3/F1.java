package serie3;

import java.util.ArrayList;

public class F1{
	private ArrayList<String[]> db;
	
	/**
	 * Initialisiert Funktion 1
	 * @param datenbank Übergebene Datenbank
	 */
	public F1(String[][] datenbank) {
		db = new ArrayList<String[]>();
		for(String[] eintrag : datenbank){
			db.add(eintrag);
		}
	}
	
	/**
	 * Gibt alle Naturkatastrophen, bei denen es Opfer gab, aus.
	 * @param expIndex Vulkanexplosivitätsindex
	 * @param wasserhoehe Mindestwasserhöhe
	 * @param staerke Mindeststärke
	 */
	public void ausgabe(int expIndex, float wasserhoehe, float staerke){
		System.out.println("----- Vulkane -----");
		System.out.println("Jahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Vulkantyp | Höhe über Meeresspiegel | Explosivitätsindex\n");
		
		for(int i=0; i<this.db.size(); i++){
			if(this.db.get(i)[0] == "V" && Integer.parseInt(this.db.get(i)[7]) > 0 && Integer.parseInt(this.db.get(i)[10]) >= expIndex){
				for(int j=1; j<this.db.get(i).length; j++){
					System.out.print(this.db.get(i)[j] + " | ");
				}
				System.out.println("");
			}
		}
		
		System.out.println("\n----- Tsunamis -----");
		System.out.println("Jahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Ursache | Erreichte Wasserhöhe\n");
		
		for(int i=0; i<this.db.size(); i++){
			if(this.db.get(i)[0] == "T" && Integer.parseInt(this.db.get(i)[7]) > 0 && Float.parseFloat(this.db.get(i)[9]) >= wasserhoehe){
				for(int j=1; j<this.db.get(i).length; j++){
					System.out.print(this.db.get(i)[j] + " | ");
				}
				System.out.println("");
			}
		}
		
		System.out.println("\n----- Erdbeben -----");
		System.out.println("Jahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Wert auf Skala | Ausdehnung in km\n");
		
		for(int i=0; i<this.db.size(); i++){
			if(this.db.get(i)[0] == "E" && Integer.parseInt(this.db.get(i)[7]) > 0 && Float.parseFloat(this.db.get(i)[8]) >= staerke){
				for(int j=1; j<this.db.get(i).length; j++){
					System.out.print(this.db.get(i)[j] + " | ");
				}
				System.out.println("");
			}
		}
	}
}
