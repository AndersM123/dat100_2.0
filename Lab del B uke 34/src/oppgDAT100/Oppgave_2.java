package oppgDAT100;

import javax.swing.JOptionPane;

public class Oppgave_2 {
	
	public static void main(String[] args) {
	
	String a = JOptionPane.showInputDialog("tall nr 1");
	String b = JOptionPane.showInputDialog("tall nr 2");
	String c = JOptionPane.showInputDialog("tall nr 3");
	String d = JOptionPane.showInputDialog("tall nr 4");
	
	int a1 = Integer.parseInt(a);
	int b1 = Integer.parseInt(b);
	int c1 = Integer.parseInt(c);
	int d1 = Integer.parseInt(d);
	
	int minst_1 = Math.min(a1, b1);
	int minst_2 = Math.min(c1, d1);
	
	int minst = Math.min(minst_1, minst_2);
	
	System.out.println(minst);
	
	}
	
}
