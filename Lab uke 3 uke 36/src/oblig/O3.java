package oblig;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn n"));
		int temp = 1;

		while (n > 1) {
			temp *= n;
			n--;
		}

		JOptionPane.showMessageDialog(null, temp);

	}

}
