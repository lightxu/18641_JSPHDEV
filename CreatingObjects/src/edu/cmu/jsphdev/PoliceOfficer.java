package edu.cmu.jsphdev;

public class PoliceOfficer {
	String name;
	String badgeNumber;
	
	public PoliceOfficer(String name, String badgeNumber) {
		this.name = name;
		this.badgeNumber = badgeNumber;
	}
	
	public boolean examineParkedCar(ParkedCar car, ParkingMeter meter) {
		long parkedMinutes = car.getParkedMinutes();
		long purchasedMinutes = meter.getPurchasedMinutes();
		if (parkedMinutes > purchasedMinutes) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public ParkingTicket issueParkingTicket(ParkedCar car, ParkingMeter meter) {
		long parkedMinutes = car.getParkedMinutes();
		long purchasedMinutes = meter.getPurchasedMinutes();
		long illegalHours = (long) Math.ceil((parkedMinutes - purchasedMinutes) / 60.0);
		long fine = 0;
		if (illegalHours > 1) {
			fine = 25 + 10 * (illegalHours - 1);
		}
		else {
			fine = 25;
		}
		return new ParkingTicket(car, this, fine);
	}
	
	public String toString() {
		String officerInfo = "Police Officer Info: \n";
		officerInfo += "Name: " + name + "\n";
		officerInfo += "Badge number: " + badgeNumber + "\n";
		officerInfo += "====================";
		return officerInfo;
	}
}
