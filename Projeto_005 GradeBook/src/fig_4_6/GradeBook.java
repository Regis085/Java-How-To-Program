package fig_4_6;

import javax.swing.JOptionPane;

//import java.util.Scanner;

public class GradeBook {
	private String courseName;

	public GradeBook(String name) {
		courseName = name;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void displayMessage() {
		// System.out.printf("Welcome to the grade book for\n%s!\n\n",
		// getCourseName());
		String message = String.format("Welcome to the grade book for\n%s!",
				getCourseName());
		JOptionPane.showMessageDialog(null, message);
	}

	public void determineClassAverage() {
		// Scanner input = new Scanner(System.in);

		int total, gradeCounter, grade, average;

		total = 0;
		gradeCounter = 1;

		while (gradeCounter <= 3) {
			// System.out.println("Enter grade: ");
			// grade = input.nextInt();
			grade = Integer
					.parseInt(JOptionPane.showInputDialog("Enter grade"));

			total += grade;
			gradeCounter++;
		}

		average = total / 3;

		String message1, message2;
		message1 = String.format("Total of all 3 grades is %d", total);
		message2 = String.format("Class average is %d", average);
		JOptionPane.showMessageDialog(null, message1);
		JOptionPane.showMessageDialog(null, message2);

		// System.out.printf("\nTotal of all 3 grades is %d\n", total);
		// System.out.printf("\nClass average is %d\n", average);

	}
}
