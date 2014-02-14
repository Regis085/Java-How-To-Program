package fig_6_11;

//Fig 6.12
//Test application that displays a smiley face.
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DrawSmileyTest extends JFrame {
	public static void main(String[] args) {
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}
}
