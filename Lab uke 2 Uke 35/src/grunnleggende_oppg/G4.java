package grunnleggende_oppg;

import javax.swing.JOptionPane;

public class G4 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int tall = Integer.parseInt(JOptionPane.showInputDialog("skriv et tall"));

			System.out.println(tall);
		}

	}

}
