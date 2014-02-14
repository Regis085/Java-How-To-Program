package fig_6_06_Random;

public class RandomIntegers {
	public static void main(String[] args) {
		java.util.Random randomNumbers = new java.util.Random();
		int face;

		for (int counter = 1; counter <= 20; counter++) {
			face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d  ", face);
			if (counter % 5 == 0)
				System.out.println();
		}
	}
}
