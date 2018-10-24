package serie2;

public class Passagier {
	private String passnummer;
	private String name;
	
	public Passagier(String passnummer, String name){
		this.passnummer = passnummer;
		this.name = name;
	}
	public String getPassnummer(){
		return passnummer;
	}
	public String getName(){
		return name;
	}
}
