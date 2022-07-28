package basis_oppgaver;

import static javax.swing.JOptionPane.*;

public class B3 {

	public static void main(String[] args) {

		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");
		
		String rett_bnavn = "tosken123";
		String rett_pass = "tosk";
		
		if(brukernavn.equals(rett_bnavn) && passord.equals(rett_pass)) {
			System.out.println("Riktig brukernavn og passord");
		} else {
			System.out.println("feil innloggingsinformasjon");
			
		}
		
	}

}
