package basis_oppgaver;

import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {

		int l�nn = Integer.parseInt(showInputDialog("Skriv inn l�nnen din: "));
		double sats1 = 1.7 / 100;
		double sats2 = 4.0 / 100;
		double sats3 = 13.2 / 100;
		double sats4 = 16.2 / 100;
		
		int trinn1 = 184800;
		int trinn2 = 260101;
		int trinn3 = 651251;
		int trinn4 = 1021550;
		
		double diff;
		double rest;
		double restrund;
		
		double trinn_12 = (trinn2 - trinn1) * sats1;
		double trinn_23 = (trinn3 - trinn2) * sats2;
		double trinn_34 = (trinn4 - trinn3) * sats3;
		double skatt;
		String betale = "Du skal betale ";
		String kr = " kr i trinnskatt.";

		if (l�nn <= trinn1) {
			showMessageDialog(null, "0" + kr);
		} else if (l�nn <= trinn2) {
			diff = l�nn - trinn1;
			rest = diff * sats1;
			restrund = rund(rest);
			showMessageDialog(null, betale + restrund + kr);
		} else if (l�nn <= trinn3) {
			diff = l�nn - trinn2;
			rest = diff * sats2;
			skatt = rund(rest + trinn_12);
			showMessageDialog(null, betale + skatt + kr);
		} else if (l�nn <= trinn4) {
			diff = l�nn - trinn3;
			rest = diff * sats3;
			skatt = rund(rest + trinn_12 + trinn_23);
			showMessageDialog(null, betale + skatt + kr);
		} else {
			diff = l�nn - trinn4;
			rest = diff * sats4;
			skatt = rund(rest + trinn_12 + trinn_23 + trinn_34);
			showMessageDialog(null, betale + skatt + kr);
		}
	}
	public static double rund(double k) {
		double a = Math.round(k*100)/100.0;
		return a;
	}

}
