/**
 * @author shicheng
 */

package edu.cmu.jsphdev.CoinTossSimulator;

public class Simulation {
	
	public static void main(String[] args) {
		Coin quarter = new Coin();
		System.out.println("The side that is initially facing up is " + quarter.getSideUp());
		
		int countHeads = 0;
		int countTails = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Round " + i);
			quarter.toss();
			System.out.println("The side that is facing up is " + quarter.getSideUp());
			if (quarter.getSideUp() == "heads") {
				countHeads = countHeads + 1;
			}
			else {
				countTails = countTails + 1;
			}
		}
		System.out.println("The number of times the heads is facing up " + countHeads);
		System.out.println("The number of times the tails is facing up " + countTails);
	}

}
