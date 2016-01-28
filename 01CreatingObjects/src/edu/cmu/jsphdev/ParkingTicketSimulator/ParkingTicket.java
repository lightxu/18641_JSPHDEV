/**
 * @author shicheng
 */

package edu.cmu.jsphdev.ParkingTicketSimulator;

public class ParkingTicket {
	ParkedCar car;
	PoliceOfficer officer;
	long fine;
	
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, long fine) {
		this.car = car;
		this.officer = officer;
		this.fine = fine;
	}
	
	public long getFine() {
		return fine;
	}
	
	public String reportCarInfo() {
		return car.toString();
	}
	
	public String reportFine() {
		return "The fine is " + Long.toString(fine) + ".\n";
	}
	
	public String reportOfficerInfo() {
		return officer.toString();
	}
}
