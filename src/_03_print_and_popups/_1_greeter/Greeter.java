package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("bonjour");
	String name = JOptionPane.showInputDialog("What is your name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null,"Hello "+ name + "! How are you?");

}
}
