/**
 * @author shicheng
 */

package edu.cmu.jsphdev.CoinTossSimulator;

public class Coin {

	private String sideUp;
	
	public Coin() {
		toss();
	}
	
	public void toss() {
		if (Math.random() > 0.5) {
			sideUp = "heads";
		}
		else {
			sideUp = "tails";
		}
	}
	
	public String getSideUp() {
		return sideUp;
	}
	
}
