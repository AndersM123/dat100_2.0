package basis_oppgaver;

import javax.swing.JOptionPane;

public class B2 {

	public static void main(String[] args) {
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn x"));
		double n = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn n"));
		
		double prod = Math.pow(x, n);
		
		System.out.println(prod);
		
	}

}
