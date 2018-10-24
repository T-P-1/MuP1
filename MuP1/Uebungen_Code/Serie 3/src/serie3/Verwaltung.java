package serie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Verwaltung{
	private List<Naturkatastrophen> katastrophenliste;
	private Vulkanausbruch vulkanausbruch;
	private Erdbeben erdbeben;
	private Tsunami tsunami;
	
	public Verwaltung(String[][] data){
		katastrophenliste = new ArrayList<Naturkatastrophen>();
		for(int i=0; i<data.length; i++){
			if(data[i][0] == "V"){
				vulkanausbruch = new Vulkanausbruch(Integer.parseInt(data[i][1]), Integer.parseInt(data[i][2]), Integer.parseInt(data[i][3]), Double.parseDouble(data[i][4]), 
								Double.parseDouble(data[i][5]), data[i][6], Integer.parseInt(data[i][7]), data[i][8], Integer.parseInt(data[i][9]), Integer.parseInt(data[i][10]));
				katastrophenliste.add(vulkanausbruch);
			}
		}
		for(int i=0; i<data.length; i++){
			if(data[i][0] == "E"){
				erdbeben = new Erdbeben(Integer.parseInt(data[i][1]), Integer.parseInt(data[i][2]), Integer.parseInt(data[i][3]), Double.parseDouble(data[i][4]),
								Double.parseDouble(data[i][5]), data[i][6], Integer.parseInt(data[i][7]), Double.parseDouble(data[i][8]), Integer.parseInt(data[i][9]));
				katastrophenliste.add(erdbeben);
			}
		}
		for(int i=0; i<data.length; i++){
			if(data[i][0] == "T"){
				tsunami = new Tsunami(Integer.parseInt(data[i][1]), Integer.parseInt(data[i][2]), Integer.parseInt(data[i][3]), Double.parseDouble(data[i][4]),
						Double.parseDouble(data[i][5]), data[i][6], Integer.parseInt(data[i][7]), Integer.parseInt(data[i][8]), Double.parseDouble(data[i][9]));
				katastrophenliste.add(tsunami);
			}
		}
	}
	
	//Funkion 1
	public void ausgabe(int opfer, int expIndex, double wasserhoehe, double staerke){
		System.out.println("\n***** Vulkanausbrueche mit Explosivitaetsindex von min. " + expIndex + " *****");
		System.out.println("\nJahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Typ | Höhe | Explosivitätsindex\n");
		
		for(int i=0; i<katastrophenliste.size(); i++) {
			if(katastrophenliste.get(i).getClass().getSimpleName().equals("Vulkanausbruch")){
				if (katastrophenliste.get(i).getOpfer() >= opfer && ((Vulkanausbruch) katastrophenliste.get(i)).getExpIndex() >= expIndex) {
					System.out.println(katastrophenliste.get(i).toString());
				}	
			}
			
		}
		System.out.println("\n***** Erdbeben mit einer Stärke von min. " + staerke + " *****");
		System.out.println("\nJahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Staerke | Ausdehnung\n");
		for(int i=0; i<katastrophenliste.size(); i++) {
			if(katastrophenliste.get(i).getClass().getSimpleName().equals("Erdbeben")){
				if (katastrophenliste.get(i).getOpfer() >= opfer && ((Erdbeben) katastrophenliste.get(i)).getStaerke() >= staerke) {
					System.out.println(katastrophenliste.get(i).toString());
				}
			}
			
		}
		System.out.println("\n***** Tsunami mit einer Wasserhoehe von min. " + wasserhoehe + " m *****");
		System.out.println("\nJahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Ursachencode | Wasserhöhe\n");
		for(int i=0; i<katastrophenliste.size(); i++){
			if(katastrophenliste.get(i).getClass().getSimpleName().equals("Tsunami")){
				if(katastrophenliste.get(i).getOpfer() >= opfer && ((Tsunami) katastrophenliste.get(i)).getWasserhoehe() >= wasserhoehe){
					System.out.println(katastrophenliste.get(i).toString());
				}
			}
		}

	}
	
	//Funktion 4
	public void ausgabe(int jahr, int opfer){
		System.out.println("Jahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Typ | Höhe | Explosivitätsindex\n");
		for(int i=0; i<katastrophenliste.size(); i++){
			if(katastrophenliste.get(i).getOpfer() == opfer && katastrophenliste.get(i).getJahr() == jahr && katastrophenliste.get(i).getClass().getSimpleName().equals("Vulkanausbruch")){
				System.out.println(katastrophenliste.get(i).toString());
			}
		}
		System.out.println("\nJahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Staerke | Ausdehnung\n");
		for(int i=0; i<katastrophenliste.size(); i++){
			if(katastrophenliste.get(i).getOpfer() == opfer && katastrophenliste.get(i).getJahr() == jahr && katastrophenliste.get(i).getClass().getSimpleName().equals("Erdbeben")){
				System.out.println(katastrophenliste.get(i).toString());
			}
		}
		System.out.println("\nJahr | Monat | Tag | Latitude | Longitude | Ort | Opfer | Ursachencode | Wasserhöhe\n");
		for(int i=0; i<katastrophenliste.size(); i++){
			if(katastrophenliste.get(i).getOpfer() == opfer && katastrophenliste.get(i).getJahr() == jahr && katastrophenliste.get(i).getClass().getSimpleName().equals("Tsunami")){
				System.out.println(katastrophenliste.get(i).toString());
			}
		}
	}
	
	//Funktion 2
	public void sortieren(){
		Collections.sort(katastrophenliste, compare);
	}
	
	//Funkion 3
	public void suche(){
		
	}

	public Comparator<Naturkatastrophen> compare = new Comparator<Naturkatastrophen>(){
		@Override
		public int compare(Naturkatastrophen obj1, Naturkatastrophen obj2) {
			int jahrdiff = Integer.compare(obj1.getJahr(), obj2.getJahr());
			if(jahrdiff != 0){
				return jahrdiff;
			}
			
			int monatdiff = Integer.compare(obj1.getMonat(), obj2.getMonat());
			if(monatdiff != 0){
				return monatdiff;
			}
			
			int tagdiff = Integer.compare(obj1.getTag(), obj2.getTag());
			return tagdiff;
		}
	};


}
