package basis_oppgaver;

import javax.swing.JOptionPane;

public class B2 {

	public static void main(String[] args ) {
		
		String pris = JOptionPane.showInputDialog("Skriv prisen");
		String bel�p = JOptionPane.showInputDialog("Skriv bel�pet");
		
		int p = Integer.parseInt(pris);
		int b = Integer.parseInt(bel�p);
		
		int sum1 = (b-p) % 10;
		int sum10 = (b-p) / 10;
		
		System.out.println("sum 1'ere: " + sum1 + "\n" + "sum 10'ere: " + sum10 );

		
	}
}
