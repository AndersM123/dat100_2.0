package oppgDAT100;

import javax.swing.JOptionPane;

public class Oppgave_3 {

	public static void main(String[] args) {
		
		String dag = JOptionPane.showInputDialog("Skriv inn dagsnummeret");
		String m�ned = JOptionPane.showInputDialog("Skriv inn m�nedsnummeret");
		String �r = JOptionPane.showInputDialog("Skriv inn �r");
		
		System.out.println("dato: " + dag + "." + m�ned + "." + �r);
		
	}

}
