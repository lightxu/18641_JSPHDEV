package edu.cmu.jsphdev;

public class ParkingTicket {
	ParkedCar car;
	PoliceOfficer officer;
	long fine;
	
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, long fine) {
		this.car = car;
		this.officer = officer;
		this.fine = fine;
	}
	
	public String reportCarInfo() {
		return car.toString();
	}
	
	public long reportFine() {
		return fine;
	}
	
	public String reportOfficerInfo() {
		return officer.toString();
	}
}
