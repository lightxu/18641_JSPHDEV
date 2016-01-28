package edu.cmu.jsphdev.StudentAnalysis.Util;

import edu.cmu.jsphdev.StudentAnalysis.Exception.*;
import edu.cmu.jsphdev.StudentAnalysis.Model.*;

/**
 * 
 * @author shicheng
 *
 */
public class StudentAnalysisSimulator extends Simulator {
	
	public static void main(String [] args) {
		StudentAnalysisSimulator simulator = new StudentAnalysisSimulator();
		
		System.out.println("Test Case 1: Normal Use Case");
		String filename1 = "/Users/shicheng/Work/CMUSV/18641_JSPHDEV/02ObjectRelationship/test/normal.txt";
		simulator.simulate(filename1);
		System.out.println("----------------------------");
		
		System.out.println("Test Case 2: Too Many Students");
		String filename2 = "/Users/shicheng/Work/CMUSV/18641_JSPHDEV/02ObjectRelationship/test/too_many_student_61.txt";
		simulator.simulate(filename2);
		System.out.println("----------------------------");
		
		System.out.println("Test Case 3: Boundary Test");
		String filename3 = "/Users/shicheng/Work/CMUSV/18641_JSPHDEV/02ObjectRelationship/test/boundary_student_40.txt";
		simulator.simulate(filename3);
		System.out.println("----------------------------");
	}
	
	@Override
	void simulate(String simulateFileName) {
		Student lab2 [] = new Student[40];
		//Populate the student array
		try {
			lab2 = StudentAnalysisUtil.readFile(simulateFileName, lab2);
			Statistics statlab2 = new Statistics();
			statlab2.findlow(lab2);
			statlab2.findhigh(lab2);
			statlab2.findavg(lab2);
			
			// Print summary table
			System.out.println(StudentAnalysisUtil.generateTableHeader());
			for (int i = 0; i < 40; i++) {
				if (lab2[i] == null)
					break;
				lab2[i].printTableContent();
			}
			statlab2.printTableContent();
		} catch (TooManyStudentRecordsException e) {
			System.out.println("Too many student records!!");
			// System.exit(1);
		}
	}
}
