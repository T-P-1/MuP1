package serie3;

public class Tsunami extends Naturkatastrophen {
	private int ursachencode;
	private double wasserhoehe;

	/**
	 * Initialisiert den Tsunami mit allen relevanten Parametern
	 * @param jahr
	 * @param monat
	 * @param tag
	 * @param latitude
	 * @param longitude
	 * @param ort
	 * @param opfer
	 * @param typ
	 * @param hoehe
	 * @param expIndex
	 */
	public Tsunami(int jahr, int monat, int tag, double latitude, double longitude, String ort, int opfer, int ursachencode, double wasserhoehe){
		this.setJahr(jahr);
		this.setMonat(monat);
		this.setTag(tag);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.setOrt(ort);
		this.setOpfer(opfer);
		setUrsachencode(ursachencode);
		setWasserhoehe(wasserhoehe);
	}

	public int getUrsachencode() {
		return ursachencode;
	}

	public double getWasserhoehe() {
		return wasserhoehe;
	}

	public void setUrsachencode(int ursachencode) {
		this.ursachencode = ursachencode;
	}

	public void setWasserhoehe(double wasserhoehe) {
		this.wasserhoehe = wasserhoehe;
	}

	@Override
	public String toString(){
		return this.getJahr() + " | " + this.getMonat() + " | " + this.getTag() + " | " + this.getLatitude() + " | " + this.getLongitude() + " | " + this.getOrt() + " | "
				+ this.getOpfer() + " | " + ursachencode + " | " + wasserhoehe;
	}
}
