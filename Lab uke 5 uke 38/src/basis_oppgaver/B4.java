package basis_oppgaver;

import javax.swing.JOptionPane;

public class B4 {

	public static void main(String[] args) {

		int antallDag = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall dager"));
		double total = 0;
		double temp[] = new double[antallDag];
		double snitt = 0;

		double max = temp[0];
		System.out.println("Analyse av temperatur");
		System.out.println("*********************");
		System.out.println("Skriv inn temperaturene:");

		for (int i = 0; i < 7; i++) {

			temp[i] = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn verdiene"));

			System.out.println(i + 1 + ". dag: " + temp[i]);

			snitt = (total += temp[i]) / 7;

			if (temp[i] > max) {
				max = temp[i];
			}
		}

		System.out.println("Gjennomsnittstemperaturen var " + snitt);
		System.out.println("Høyeste temperatur var " + max);

	}

}
