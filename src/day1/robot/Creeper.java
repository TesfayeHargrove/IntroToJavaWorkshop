package day1.robot;

import javax.swing.JOptionPane;

public class Creeper {
 public static void main(String[] args) {
	String Name= JOptionPane.showInputDialog("Whats your name");
	String Age= JOptionPane.showInputDialog("How Old Are You");
	String Adress= JOptionPane.showInputDialog("Where Do You Live");
	String Color= JOptionPane.showInputDialog("What's Your Favorite Color");
	String School= JOptionPane.showInputDialog("What School Do You Go To");
	JOptionPane.showMessageDialog(null,"So Your name is "+ Name );
	JOptionPane.showMessageDialog(null,"Your "+ Age + " Years Old");
	JOptionPane.showMessageDialog(null,"You Live in "+ Adress);
	JOptionPane.showMessageDialog(null,"Your Fovorite Color is  "+ Color );
	JOptionPane.showMessageDialog(null,"You Go To  "+ School );
	JOptionPane.showMessageDialog(null,"DONT GIVE YOUR INFORMATION \n OUT TO STRANGERS OR THEY WILL FIND YOU" );
	
	
	
	
	
}	
}
