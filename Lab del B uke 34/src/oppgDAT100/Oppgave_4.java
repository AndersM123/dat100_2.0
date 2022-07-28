package oppgDAT100;

import javax.swing.JOptionPane;

public class Oppgave_4 {

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("Skriv inn antall sekunder");
		
		int sekunder = Integer.parseInt(s);
		
		int timer = sekunder / 3600;
		
		int min = (sekunder % 3600) / 60;
		
		int sek = sekunder % 60;
		
	System.out.println(timer + " timer" + ", " + min + " minutter" + ", " + sek + " sekunder");
		
	}

}
