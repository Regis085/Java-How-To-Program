import java.util.Scanner;

public class GradeBookTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook1 = new GradeBook(
				"CS101 Introduction to Java Programming");
		GradeBook myGradeBook2 = new GradeBook("CS102 Data Structures in Java");

		System.out.printf("gradeBook1 course name is %s\n\n",
				myGradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is %s\n\n",
				myGradeBook2.getCourseName());

		input.close();
	}
}
