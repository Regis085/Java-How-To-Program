package fig_3_18;

public class NameDialog {

	public static void main(String[] args) {
		String name = javax.swing.JOptionPane
				.showInputDialog("What is your name?");

		String message = String
				.format("Welcome, %s, to Java Programming", name);
		
		javax.swing.JOptionPane.showMessageDialog(null, message);

	}

}
