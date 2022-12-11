package del_2;

import javax.swing.JOptionPane;

public class Oppgave_3 {

	public static void main(String[] args) {

		String a = "";
		int sum = 0;
		int t = 1;
		int i=-1;
		
		while (t != 0) {
			i+=1;
			a = JOptionPane.showInputDialog("Skriv inn ditt heltall");
			t = Integer.parseInt(a);
			sum = sum + t;
		}
		System.out.println("Antall tall:" + i);
		System.out.println("Sum: "+ sum);
	}

}
