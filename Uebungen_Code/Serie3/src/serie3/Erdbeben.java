package serie3;

public class Erdbeben extends Naturkatastrophen {
	private double staerke;
	private int ausdehnung;

	/**
	 * Initialisiert das Erdbeben mit allen relevanten Parametern
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
	public Erdbeben(int jahr, int monat, int tag, double latitude, double longitude, String ort, int opfer, double staerke, int ausdehnung){
		this.setJahr(jahr);
		this.setMonat(monat);
		this.setTag(tag);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.setOrt(ort);
		this.setOpfer(opfer);
		setStaerke(staerke);
		setAusdehnung(ausdehnung);
	}

	public double getStaerke() {
		return staerke;
	}

	public int getAusdehnung() {
		return ausdehnung;
	}

	public void setStaerke(double staerke) {
		this.staerke = staerke;
	}

	public void setAusdehnung(int ausdehnung) {
		this.ausdehnung = ausdehnung;
	}

	@Override
	/**
	 * Gibt einen String des jeweiligen Naturkatastrophenobjekts aus
	 */
	public String toString(){
		return this.getJahr() + " | " + this.getMonat() + " | " + this.getTag() + " | " + this.getLatitude() + " | " + this.getLongitude() + " | " + this.getOrt() + " | "
				+ this.getOpfer() + " | " + staerke + " | " + ausdehnung;
	}
}
