package edu.cmu.jsphdev;

public class ParkingMeter {
	
	long purchasedMinutes;
	
	public ParkingMeter(long purchasedMinutes) {
		this.purchasedMinutes = purchasedMinutes;
	}
	
	public long getPurchasedMinutes() {
		return purchasedMinutes;
	}

}
