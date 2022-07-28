package basis_oppgaver;

import javax.swing.JOptionPane;

public class B5 {

	public static void main(String[] args) {

		boolean valid = true;

		int A = 90;
		int B = 80;
		int C = 60;
		int D = 50;
		int E = 40;

		while (valid) {
			for (int i = 0; i < 10; i++) {

				String poengsum = JOptionPane.showInputDialog("skriv inn hvor mye poeng du fikk");
				int poeng = Integer.parseInt(poengsum);

				if (poeng < E && poeng > 0) {
					System.out.println(poeng + " gir karakter F");
				} else if (poeng < D && poeng >= E) {
					System.out.println(poeng + " gir karakter E");
				} else if (poeng < C && poeng >= D) {
					System.out.println(poeng + " gir karakter D");
				} else if (poeng < B && poeng >= C) {
					System.out.println(poeng + " gir karakter C");
				} else if (poeng < A && poeng >= B) {
					System.out.println(poeng + " gir karakter B");
				} else if (poeng >= A && poeng <= 100) {
					System.out.println(poeng + " gir karakter A");
				} else if(poeng > 100 || poeng < 0) {
					System.out.println("invalid");
					valid = false;
					i = i-1;

				}

			}
		}

	}

}
