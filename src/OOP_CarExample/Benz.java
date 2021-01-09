package OOP_CarExample;

import java.awt.Color;

public class Benz extends Car{

	private String series;
	private int year;
	private String benzID;
	private boolean heatingCoolingSeats;
	private boolean tirePressureMonitor;
	
	// create constructors
	// create getters and setters
	// create toString method
	
	public Benz() {
		super();
		this.series = "";
		this.year = 0;
		this.benzID = "";
		this.heatingCoolingSeats= false;
		this.tirePressureMonitor = false;
		
	}
	
	public Benz(String series, int year, String benzID, boolean heatingCoolingSeats, boolean tirePressureMonitor, String typeOfEngine, boolean sunRoof,
			double horsePower, int speedLimid, String trim) {
		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim);
		this.series = series;
		this.year = year;
		this.benzID = benzID;
		this.heatingCoolingSeats = heatingCoolingSeats;
		this.tirePressureMonitor = tirePressureMonitor;
		
	}
	
	public Benz(String series, int year, String benzID, boolean heatingCoolingSeats, boolean tirePressureMonitor, String typeOfEngine, boolean sunRoof,
			double horsePower, int speedLimid, String trim, String make, String model, int numberOfDoors, double price,
			String name, Color color) {
		super(typeOfEngine, sunRoof, horsePower, speedLimid, trim, make, model, numberOfDoors, price, name, color);
		this.series = series;
		this.year = year;
		this.benzID = benzID;
		this.heatingCoolingSeats = heatingCoolingSeats;
		this.tirePressureMonitor = tirePressureMonitor;

	}
	
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBenzID() {
		return benzID;
	}
	public void setBenzID(String benzID) {
		this.benzID = benzID;
	}
	public boolean isHeatingCoolingSeats() {
		return heatingCoolingSeats;
	}
	public void setHeatingCoolingSeats(boolean heatingCoolingSeats) {
		this.heatingCoolingSeats = heatingCoolingSeats;
	}

	public boolean isTirePressureMonitor() {
		return tirePressureMonitor;
	}
	public void setTirePressureMonitor(boolean tirePressureMonitor) {
		this.tirePressureMonitor = tirePressureMonitor;
	}
	@Override
	public String toString() {
		return "Benz [series=" + series + ", year=" + year + ", benzID=" + benzID + ", heatingCoolingSeats="
				+ heatingCoolingSeats + ", tirePressureMonitor=" + tirePressureMonitor + "]";
	}
	
	
	
	
}
