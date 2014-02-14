package fig_5_09;

public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook myGradeBook = new GradeBook(
				"CS101 Introduction to Java Programming");

		myGradeBook.displayMessage();
		myGradeBook.inputGrades();
		myGradeBook.displayGradeReport();
	}
}

// para que o ctrl + z funcione mude o foco do console para outra área da IDE e
// depois volte.