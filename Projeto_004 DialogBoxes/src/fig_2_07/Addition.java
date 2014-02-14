package fig_2_07;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {

		int number1, number2, sum;

		number1 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter first integer"));
		number2 = Integer.parseInt(JOptionPane
				.showInputDialog("Enter second integer"));

		sum = number1 + number2;

		String message = String.format("Sum is %d\n", sum);

		JOptionPane.showMessageDialog(null, message);
		System.out.printf("Sum is %d\n", sum);

	}

}
