package basis_oppgaver;

import javax.swing.JOptionPane;

public class B1 {

	public static void main(String[] args) {
		int Nedre_grense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den nedre grensen"));
		int Øvre_grense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den øvre grensen"));

		for (int i = Nedre_grense; i <= Øvre_grense; i++) {
			if (i % 2 != 0) {
				JOptionPane.showMessageDialog(null, i);
			}

		}

	}

}
