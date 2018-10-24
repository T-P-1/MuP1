package serie2;

public class Flugplanung {
	private String flugnummer;
	private String flugdatum;
	private Klasse economyClass;
	private Klasse businessClass;
	
	public Flugplanung(String flugnummer, String flugdatum, int economySitze, int businessSitze){
		this.flugnummer = flugnummer;
		this.flugdatum = flugdatum;
		economyClass = new Klasse(economySitze);
		businessClass = new Klasse(businessSitze);
	}
	public boolean buchung(Passagier passagier, String klasse){
		//Doppelbuchung prüfen
		if(economyClass.getPassagiere()[0] != null && klasse.equals("economy")){
			for(int i=0; i<economyClass.getPassagiere().length; i++){
				if(economyClass.getPassagiere()[i] != null && economyClass.getPassagiere()[i].getPassnummer() == passagier.getPassnummer()){
					System.out.println("Passagier ist bereits vorhanden.");
					return false;
				}
			}
		}
		else if(businessClass.getPassagiere()[0] != null && klasse.equals("business")){
			for(int i=0; i<businessClass.getPassagiere().length; i++){
				if(businessClass.getPassagiere()[i] != null && businessClass.getPassagiere()[i].getPassnummer() == passagier.getPassnummer()){
					System.out.println("Passagier ist bereits vorhanden.");
					return false;
				}
			}
		}
		//Ist ein Platz frei? Dann buche
		if(economyClass.getPassagiere()[economyClass.getPassagiere().length-1] == null && klasse.equals("economy")){
			economyClass.addPassagier(passagier);
			System.out.println("Passagier hat den Flug gebucht.");
			return true;
		}
		else if(businessClass.getPassagiere()[businessClass.getPassagiere().length-1] == null && klasse.equals("business")){
			businessClass.addPassagier(passagier);
			System.out.println("Passagier hat den Flug gebucht.");
			return true;
		}
		
		return false;
	}
	public void stornieren(String passnummer){
		//wirft Exception
		if(economyClass.getPassagier(passnummer) != null){
			economyClass.removePassagier(passnummer);
		}
		else if(businessClass.getPassagier(passnummer) != null){
			businessClass.removePassagier(passnummer);
		}
		else{
			System.out.println("Passagier nicht vorhanden.");
		}
	}
	public boolean upgrade (String passnummer, String klasse){
		if(passnummer.equals(passnummer) && klasse.equals("economy")){
			economyClass.removePassagier(passnummer);
			businessClass.addPassagier(businessClass.getPassagier(passnummer));
			System.out.println("Upgrade erfolgreich.");
			return true;
		}
		else{
			System.out.println("Upgrade nicht möglich.");
		}
		return false;
	}
	
	@Override
	public String toString(){
		int ecoSitze = 0;
		int businessSitze = 0;
		/*
		 * Falls erster Eintrag null ist, gibt es keine Passagiere
		 * (nur relevant für korrekte Zählung) 
		 */
		if(economyClass.getPassagiere()[0] == null){ecoSitze = 0;}
		else{
			for(int i=0; i<economyClass.getPassagiere().length; i++){
				if(economyClass.getPassagiere()[i] != null){
					ecoSitze++;
				}
				else{
					break;
				}
			}
		}
		/*
		 * Falls erster Eintrag null ist, gibt es keine Passagiere
		 * (nur relevant für korrekte Zählung) 
		 */
		if(businessClass.getPassagiere()[0] == null){businessSitze = 0;}
		else{
			for(int i=0; i<businessClass.getPassagiere().length; i++){
				if(businessClass.getPassagiere()[i] != null){
					businessSitze++;
				}
			}
		}
				
		return "Flugnummer: " + this.flugnummer + "\nFlugdatum: " + this.flugdatum + "\nBelegte Sitze in Economy Class: " 
	+ ecoSitze + " von " + economyClass.getPassagiere().length + "\nBelegte Sitze in Business Class: " + businessSitze + " von " + businessClass.getPassagiere().length;  	
	}
}
