package fig_5_09;
//para que o ctrl + z funcione mude o foco do console para outra área da IDE e depois volte.
import java.util.Scanner;

public class GradeBook {
	private String courseName;
	private int total;
	private int gradeCounter;
	private int aCount;
	private int bCount;
	private int cCount;
	private int dCount;
	private int fCount;

	public GradeBook(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String name) {
		courseName = name;
	}

	public void displayMessage() {
		System.out.printf("Welcome to the grade book for \n%s!\n\n",
				getCourseName());
	}

	// input arbitrary number of grades from user
	public void inputGrades() {
		Scanner input = new Scanner(System.in);
		int grade; // grade entered by user

		System.out.printf("%s\n%s\n  %s\n  %s\n",
				"Enter the integer grades in the range 1-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
				"On Windows type <Ctrl> z");

		// loop until user enters the end-of-file indicator
		while (input.hasNext()) {
			grade = input.nextInt(); // read grade
			total += grade; // add grade to total
			++gradeCounter; // increment number of grades

			// call method to increment appropriate counter
			incrementLetterGradeCounter(grade);
		}
		input.close();
	}

	// add 1 to appropriate counter for specified grade
	private void incrementLetterGradeCounter(int grade) {
		// determine which grade was entered
		switch (grade / 10) {
		case 9: // grade was between 90
		case 10: // and 100, inclusive
			++aCount;
			break;

		case 8:
			++bCount; // grade was between 80 and 89
			break;

		case 7:
			++cCount; // grade was between 70 and 79
			break;

		case 6:
			++dCount; // grade was between 60 and 69
			break;

		default:
			++fCount; // grade was less than 60
			break; // optional; will exit switch anyway
		}
	}

	public void displayGradeReport() {
		System.out.println("\nGrade Report:");

		// if user entered at least one grade...
		if (gradeCounter != 0) {
			// calculate average of all grades entered
			double average = (double) total / gradeCounter;

			// output summary of results
			System.out.printf("Total of the %d grades entered is %d\n",
					gradeCounter, total);
			System.out.printf("Class average is %.2f\n", average);
			System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
					"Number of Students who received each grade:", "A: ",
					aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ",
					fCount);
		} else {
			System.out.println("No grades were entered");
		}
	}
}
