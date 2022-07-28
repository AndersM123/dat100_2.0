package oppgDAT100;

import javax.swing.JOptionPane;

public class Oppgave_3 {

	public static void main(String[] args) {
		
		String dag = JOptionPane.showInputDialog("Skriv inn dagsnummeret");
		String måned = JOptionPane.showInputDialog("Skriv inn månedsnummeret");
		String år = JOptionPane.showInputDialog("Skriv inn år");
		
		System.out.println("dato: " + dag + "." + måned + "." + år);
		
	}

}
