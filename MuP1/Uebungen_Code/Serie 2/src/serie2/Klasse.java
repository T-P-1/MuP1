package serie2;

public class Klasse {
	private Passagier[] passagiere;
	
	public Klasse(int maxPassagiere){
		passagiere = new Passagier[maxPassagiere];
	}
	public Passagier[] getPassagiere(){
		return passagiere;
	}
	public Passagier getPassagier(String passnummer){
		for(int i=0; i<passagiere.length; i++){
			if(passagiere[i].getPassnummer().equals(passnummer)){
				return passagiere[i];
			}
			
		}
		return null;
	}
	public boolean addPassagier(Passagier passagier){
		//Prüfung, ob Platz in der Klasse ist
		for(int i=0; i<passagiere.length; i++){
			if(passagiere[i] == null){
				passagiere[i] = passagier;
				return true;
			}
		}
		return false;
	}
	public void removePassagier(String passnummer){
		for(int i=0; i<passagiere.length; i++){
			if(passagiere[i].getPassnummer().equals(passnummer)){
				passagiere[i] = null;
				break;
			}
		}
	}
}
