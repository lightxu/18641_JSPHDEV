/**
 * @author shicheng
 */

package edu.cmu.jsphdev.ParkingTicketSimulator;

public class ParkedCar {
	String make;
	String model;
	String color;
	String licenseNumber;
	long parkedMinutes;
	
	public ParkedCar(String make, String model, String color, String licenseNumber, long parkedMinutes) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.parkedMinutes = parkedMinutes;
	}
	
	public String getCarMake() {
		return make;
	}
	
	public String getCarModel() {
		return model;
	}
	
	public String getCarColor() {
		return color;
	}
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	
	public long getParkedMinutes() {
		return parkedMinutes;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	public void setParkedMinutes(long parkedMinutes) {
		this.parkedMinutes = parkedMinutes;
	}
	
	public String toString() {
		String carInfo = "Parked Car Info: \n";
		carInfo += "  Make: " + make + "\n";
		carInfo += "  Model: " + model + "\n";
		carInfo += "  Color: " + color + "\n";
		carInfo += "  License number: " + licenseNumber + "\n";
		carInfo += "  Parked minutes: " + Long.toString(this.parkedMinutes) + "\n";
		carInfo += "================\n";
		return carInfo;
	}
}
