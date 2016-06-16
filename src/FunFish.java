import javax.swing.JOptionPane;

public class FunFish {
	public static void main(String[] args) {
		String Adj = JOptionPane.showInputDialog(null, "Type in an Adjective");
		String Liquid = JOptionPane.showInputDialog(null, "Type in a Liquid");
		String Body = JOptionPane.showInputDialog(null, "Type in a Body Part");
		String Verb = JOptionPane.showInputDialog(null, "Type in a Verb");
		String Place = JOptionPane.showInputDialog(null, "Type in a Place");

		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		JOptionPane.showMessageDialog(null,
				"Piranhas are more " + Adj + " during the day, so cross the river at night. Piranhas are attracted \n to fresh " + Liquid
						+ " and will most likely take a bite out of your " + Body + " if you " + Verb
						+ ".\n Whatever you do, if you have an open wound, try to find another way to get back to the " + Place + " Good luck!");
	}
}
