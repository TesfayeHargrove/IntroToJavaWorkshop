import java.util.Random;

import javax.swing.JOptionPane;

public class MagicBall {
	public static void main(String[] args) {
		JOptionPane.showInputDialog("Enter a question");
		
		int magic = new Random().nextInt(4);
		if (magic == 0) {

			JOptionPane.showMessageDialog(null, "Hell Yea");
		}
		if (magic == 1) {
			JOptionPane.showMessageDialog(null, "Hell No");
		}
		if (magic == 2) {
			JOptionPane.showMessageDialog(null, "Maybe So");
		}
		if (magic == 3) {
			JOptionPane.showMessageDialog(null, "I Dont Know and I Dont Care");
		}
	}
}
