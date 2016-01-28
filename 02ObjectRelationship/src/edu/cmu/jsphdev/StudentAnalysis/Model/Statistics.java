package edu.cmu.jsphdev.StudentAnalysis.Model;
/**
 * Class Statistics 
 * @author shicheng
 * @email shicheng@andrew.cmu.edu
 */

public class Statistics implements PrintableTableContent {
	static int BIG_SCORE = 1000;
	static int SMALL_SCORE = 0;
	static int SUBJECT_CNT = 5;
	
	private int [] lowscores = new int [SUBJECT_CNT];
	private int [] highscores = new int [SUBJECT_CNT];
	private float [] avgscores = new float [SUBJECT_CNT];
	
	/**
	 * This method will find the lowest score and store it in
	 * an array names lowscores.
	 * @param a
	*/
	public void findlow(Student [] a){
		for (int i = 0; i < SUBJECT_CNT; i++) {
			lowscores[i] = BIG_SCORE;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == null)
					break;
				if (a[j].getScore(i) < lowscores[i])
					lowscores[i] = a[j].getScore(i);
			}
		}
	}
	
	/**
	 * This method will find the highest score and store it in
	 * an array names highscores.
	 * @param a
	 */
	public void findhigh(Student [] a){
		for (int i = 0; i < SUBJECT_CNT; i++) {
			highscores[i] = SMALL_SCORE;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == null)
					break;
				if (a[j].getScore(i) > highscores[i])
					highscores[i] = a[j].getScore(i);
			}
		}
	}
	
	/**
	 * This method will find average score for each quiz and store
	 * it in an array names avgscores.
	 * @param a
	 */
	public void findavg(Student [] a){
		for (int i = 0; i < SUBJECT_CNT; i++) {
			avgscores[i] = 0.0f;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == null)
					break;
				avgscores[i] += a[j].getScore(i);
			}
			avgscores[i] /= a.length;
		}
	}

	@Override
	public void printTableContent() {
		String message = "";
		message += "High Score";
		for (int i = 0; i < SUBJECT_CNT; i++) {
			message += "\t";
			message += Integer.toString(highscores[i]);
		}
		message += "\n";
		
		message += "Low Score";
		for (int i = 0; i < SUBJECT_CNT; i++) {
			message += "\t";
			message += Integer.toString(lowscores[i]);
		}
		message += "\n";
		
		message += "Average";
		for (int i = 0; i < SUBJECT_CNT; i++) {
			message += "\t";
			message += String.format("%.1f", avgscores[i]);
		}
		message += "\n";
		System.out.println(message);
	}
}
