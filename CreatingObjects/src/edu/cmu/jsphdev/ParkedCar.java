package edu.cmu.jsphdev;

public class ParkedCar {
	String make;
	String model;
	String color;
	String licenseNumber;
	long parkedTime;
	
	public ParkedCar(String make, String model, String color, String licenseNumber) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.parkedTime = System.currentTimeMillis();
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
		long now = System.currentTimeMillis();
		long diff = now - parkedTime;
		long parkedMinutes = Math.floorDiv(diff, 1000 * 60);
		return parkedMinutes;
	}
	
	public String toString() {
		String carInfo = "Parked Car Info: \n";
		carInfo += "  Make: " + make + "\n";
		carInfo += "  Model: " + model + "\n";
		carInfo += "  Color: " + color + "\n";
		carInfo += "  License number: " + licenseNumber + "\n";
		carInfo += "================\n";
		return carInfo;
	}
}
