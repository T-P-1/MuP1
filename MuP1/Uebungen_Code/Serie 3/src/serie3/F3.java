package serie3;

import java.util.ArrayList;

public class F3{
	private ArrayList<String[]> sortierteDaten;
	
	/**
	 * Initialisiert Funktion 3
	 * @param datenbank Übergebene Datenbank
	 */
	public F3(String[][] datenbank){
		this.sortierteDaten = new F2(datenbank).sortieren();
	}
	
	public ArrayList<String[]> suche(String jahr, String monat, String tag){
		/*
		 * - Erstelle Liste mit Hashcodes des Datums
		 * - Diese Liste enthält eindeutige Positionen der sublist (Anfangs- und Endindex)
		 * - Information nutzen, um sublist zu erstellen
		 * - retainAll auf die ursprüngliche Liste anwenden (um die überschüssigen Einträge zu entfernen)
		 * - G als weiteren Filter anwenden
		 */
		ArrayList<String[]> daten = sortierteDaten;
		ArrayList<Integer> hashcodes = new ArrayList<Integer>();
		int code = 0;
		int gesuchterHash = jahr.concat(monat.concat(tag)).hashCode();
		
		for(int i=0; i<daten.size(); i++){
			code = daten.get(i)[1].concat(daten.get(i)[2].concat(daten.get(i)[3])).hashCode();
			hashcodes.add(code);
		}
		
		daten.retainAll(daten.subList(hashcodes.indexOf(gesuchterHash), hashcodes.lastIndexOf(gesuchterHash)));
		
		if(daten.size() <= 1){
			return daten;
		}
		else{
			for(int i=0; i<daten.size()-1; i++){
					double latitude1 = Double.parseDouble(daten.get(i)[4]);
					double latitude2 = Double.parseDouble(daten.get(i+1)[4]);
					double longitude1 = Double.parseDouble(daten.get(i)[5]);
					double longitude2 = Double.parseDouble(daten.get(i+1)[5]);
					//???
					double geodistanz = 6378*Math.acos((Math.sin(latitude1))*Math.sin(latitude2))+(Math.cos(latitude1)*Math.cos(latitude2)*Math.cos(longitude2-longitude1));
					System.out.println(geodistanz);
			}
		}
		return daten;
	}
}
