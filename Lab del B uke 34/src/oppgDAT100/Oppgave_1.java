package oppgDAT100;

import javax.swing.JOptionPane;

public class Oppgave_1 {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("tall nr 1");
		String b = JOptionPane.showInputDialog("tall nr 2");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);

		
		System.out.println(a1 + b1);
		
	}

}
