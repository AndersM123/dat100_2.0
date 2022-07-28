package basis_oppgaver;

import javax.swing.JOptionPane;

public class B2 {

	public static void main(String[] args) {

		int a = areal("Skriv inn bredde: ", "Skriv inn h�yde: ");
		JOptionPane.showMessageDialog(null, "Areal: " + a);

		int t = lesInnTall("Skriv inn tall");
		JOptionPane.showMessageDialog(null, "Tall: " + t);
	}

	private static int areal(String b, String h) {

		int bredde = Integer.parseInt(JOptionPane.showInputDialog(b));
		int hoyde = Integer.parseInt(JOptionPane.showInputDialog(h));

		int flateareal = bredde * hoyde;

		return flateareal;
	}

	private static int lesInnTall(String message) {
		int tall;
		
		do {
		 tall = Integer.parseInt(JOptionPane.showInputDialog(message));
		} while(tall < 0);
		
		return tall;
	}

}
