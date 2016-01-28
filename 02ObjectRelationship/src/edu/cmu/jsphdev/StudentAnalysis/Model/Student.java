package edu.cmu.jsphdev.StudentAnalysis.Model;
/**
 *
 * @author shicheng
 * @email shicheng@andrew.cmu.edu
 */

public class Student implements PrintableTableContent {
	private int SID;
	private int scores[] = new int[5];
	public Student() {}
	
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int getScore(int i) {
		return scores[i];
	}
	public void setScore(int i, int score) {
		this.scores[i] = score;
	}
	@Override
	public void printTableContent() {
		String message = Integer.toString(SID);
		for (int i = 0; i < 5; i++) {
			message += "\t";
			message += Integer.toString(scores[i]);
		}
		System.out.println(message);
	}
}