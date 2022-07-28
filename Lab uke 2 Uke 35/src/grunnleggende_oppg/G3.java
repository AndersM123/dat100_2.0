package grunnleggende_oppg;

import javax.swing.JOptionPane;

public class G3 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall a"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall b"));

		if (a == 0 || b == 0) {
			System.out.println("feilmelding");
		} else {
			System.out.println(a / b);
		}

	}

}
