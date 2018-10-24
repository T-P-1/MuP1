package serie3;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Naturkatastrophen {
	private int jahr;
	private int monat;
	private int tag;
	private double latitude;
	private double longitude;
	private String ort;
	private int opfer;
	
	public int getJahr() {
		return jahr;
	}
	public int getMonat() {
		return monat;
	}
	public int getTag() {
		return tag;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public String getOrt() {
		return ort;
	}
	public int getOpfer() {
		return opfer;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	public void setMonat(int monat) {
		this.monat = monat;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setOpfer(int opfer) {
		this.opfer = opfer;
	}
}
