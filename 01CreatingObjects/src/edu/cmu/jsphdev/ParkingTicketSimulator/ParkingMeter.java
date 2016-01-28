/**
 * @author shicheng
 */

package edu.cmu.jsphdev.ParkingTicketSimulator;

public class ParkingMeter {
	
	long purchasedMinutes;
	
	public ParkingMeter(long purchasedMinutes) {
		this.purchasedMinutes = purchasedMinutes;
	}
	
	public long getPurchasedMinutes() {
		return purchasedMinutes;
	}

}
