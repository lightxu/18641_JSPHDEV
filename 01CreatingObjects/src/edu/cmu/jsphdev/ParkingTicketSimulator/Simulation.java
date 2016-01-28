/**
 * @author shicheng
 */

package edu.cmu.jsphdev.ParkingTicketSimulator;

public class Simulation {

	public static void main(String[] args) {
		PoliceOfficer officer = new PoliceOfficer("Jack", "PO001");
		System.out.println(officer.toString());
		System.out.println("\n");
		
		// TEST CASE 1: Park 30 minutes;
		System.out.println("TEST CASE 1: Park 30 minutes\n");
		ParkedCar car1 = new ParkedCar("BMW", "T8", "black", "00001", 30);
		ParkingMeter meter1 = new ParkingMeter(60);
		System.out.println(car1.toString());
		if (officer.examineParkedCar(car1, meter1)) {
			System.out.println("TEST FAILED.\n");
		} else {
			System.out.println("TEST SUCCESS.\n");
		}
		System.out.println("\n");
		
		// TEST CASE 2: Park 120 minutes;
		System.out.println("TEST CASE 2: Park 120 minutes\n");
		ParkedCar car2 = new ParkedCar("TOYOTA", "RAV4", "blue", "00002", 120);
		ParkingMeter meter2 = new ParkingMeter(60);
		System.out.println(car2.toString());
		if (officer.examineParkedCar(car2, meter2)) {
			ParkingTicket ticket = officer.issueParkingTicket(car2, meter2);
			System.out.println(ticket.reportFine());
			System.out.println("TEST SUCCESS.\n");
		} else {
			System.out.println("TEST FAILED.\n");
		}
		System.out.println("\n");
		
		// TEST CASE 3: Park 59 minutes;
		System.out.println("TEST CASE 3: Park 59 minutes\n");
		ParkedCar car3 = new ParkedCar("MAZDA", "CX-9", "black", "00003", 59);
		ParkingMeter meter3 = new ParkingMeter(60);
		System.out.println(car3.toString());
		if (officer.examineParkedCar(car3, meter3)) {
			System.out.println("TEST FAILED.\n");
		} else {
			System.out.println("TEST SUCCESS.\n");
		}
		System.out.println("\n");
		
		// TEST CASE 4: Park 300 minutes;
		System.out.println("TEST CASE 4: Park 300 minutes\n");
		ParkedCar car4 = new ParkedCar("Ford", "F-150", "red", "00004", 300);
		ParkingMeter meter4 = new ParkingMeter(60);
		System.out.println(car4.toString());
		if (officer.examineParkedCar(car4, meter4)) {
			ParkingTicket ticket = officer.issueParkingTicket(car4, meter4);
			System.out.println(ticket.reportFine());
			System.out.println("TEST SUCCESS.\n");
		} else {
			System.out.println("TEST FAILED.\n");
		}
		System.out.println("\n");
	}

}
