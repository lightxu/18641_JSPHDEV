package edu.cmu.jsphdev.StudentAnalysis.Util;

import edu.cmu.jsphdev.StudentAnalysis.Model.*;
import java.io.*;
import java.util.StringTokenizer;
import edu.cmu.jsphdev.StudentAnalysis.Exception.*;

/**
 * 
 * @author shicheng
 *
 */
public class StudentAnalysisUtil {
	/**
	 * Generate string for table header
	 * @return tableHeader
	 */
	static String generateTableHeader() {
		return "Stud\tQ1\tQ2\tQ3\tQ4\tQ5";
	}
	
	/**
	 * Reads the file and builds student array.
	 * Open the file using FileReader Object.
	 * In a loop read a line using readLine method.
	 * Tokenize each line using StringTokenizer Object
	 * Each token is converted from String to Integer using parseInt method
	 * Value is then saved in the right property of Student Object.
	 * @param filename
	 * @param stu
	 * @return studentRecords
	 * @throws TooManyStudentRecordsException 
	 */
	static Student [] readFile(String filename, Student [] stu) throws TooManyStudentRecordsException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			// skip the first line
			br.readLine();
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				if (i >= 40) {
					br.close();
					throw new TooManyStudentRecordsException();
				}
				// System.out.println(line);
				stu[i] = new Student();
				StringTokenizer st = new StringTokenizer(line);
				stu[i].setSID(Integer.parseInt(st.nextToken()));
				for (int j = 0; j < 5; j++) {
					stu[i].setScore(j, Integer.parseInt(st.nextToken()));
				}
				i = i + 1;
			}
			br.close();
			
			// Reset all the rest objects
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
}