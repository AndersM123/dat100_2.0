package valgfrie_oppgaver;

import javax.swing.JOptionPane;

public class V1_valgsetninger {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(
				JOptionPane.showInputDialog("skriv inn det første tallet"));
		int num2 = Integer.parseInt(
				JOptionPane.showInputDialog("skriv inn det andre tallet"));
		int num3 = Integer.parseInt(
				JOptionPane.showInputDialog("skriv inn det tredje tallet"));
//		
//		if(num1 < num2 && num1 < num3 && num2 < num3) {
//			System.out.println(num1 + ", " + num2 + ", " + num3);	
//		}
//		
//		if(num1 > num2 && num1 > num3 && num2 > num3) {
//			System.out.println(num3 + ", " + num2 + ", " + num1);
//		}
//		
//		if(num1 > num2 && num1 < num3 && num2 < num3) {
//			System.out.println(num2 + ", " + num1 + ", " + num3);
//		}
//		
//		if(num1 < num2 && num1 > num3 && num2 > num3) {
//			System.out.println(num3 + ", " + num1 + ", " + num2);
//		}
		
		if(num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num1 + ", " + num2 + ", " + num3);	
		}
		
		else if(num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println(num3 + ", " + num2 + ", " + num1);
		}
		
		else if(num1 > num2 && num1 < num3 && num2 < num3) {
			System.out.println(num2 + ", " + num1 + ", " + num3);
		}
		
		else if(num1 < num2 && num1 > num3 && num2 > num3) {
			System.out.println(num3 + ", " + num1 + ", " + num2);
		}
		
		
	}

}
