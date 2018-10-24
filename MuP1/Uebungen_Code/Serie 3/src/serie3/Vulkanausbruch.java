package serie3;

public class Vulkanausbruch extends Naturkatastrophen{
	private String typ;
	private int hoehe;
	private int expIndex;
	
	public Vulkanausbruch(int jahr, int monat, int tag, double latitude, double longitude, String ort, int opfer, String typ, int hoehe, int expIndex){
		this.setJahr(jahr);
		this.setMonat(monat);
		this.setTag(tag);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.setOrt(ort);
		this.setOpfer(opfer);
		setTyp(typ);
		setHoehe(hoehe);
		setExpIndex(expIndex);
	}
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	public int getExpIndex() {
		return expIndex;
	}

	public void setExpIndex(int expIndex) {
		this.expIndex = expIndex;
	}

	@Override
	public String toString(){
		return this.getJahr() + " | " + this.getMonat() + " | " + this.getTag() + " | " + this.getLatitude() + " | " + this.getLongitude() + " | " + this.getOrt() + " | " 
	+ this.getOpfer() + " | " + typ + " | " + hoehe + " | " + expIndex;
	}
}
