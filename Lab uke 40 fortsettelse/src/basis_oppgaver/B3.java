package basis_oppgaver;

import java.util.Arrays;
import java.util.Scanner;

public class B3 {

	public static void main(String[] args) {
		System.out.println("Skriv inn noe: ");
		int teller = 1;
		int tellMønster = 0;
		String ord = "og";
		String[] sTab = new String[1];
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String[] a = s.split(" ");

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				teller++;
			}
		}
		
		sTab[0] = s;

		for (int i = 0; i < a.length; i++) {
			if (ord.equals(a[i])) {
				tellMønster++;
			}
		}

		sc.close();
		System.out.println("Antall ord er : " + teller);
		System.out.println("Tabellen sTab inneholder: " + Arrays.toString(sTab));
		System.out.println();
		System.out.println("antall ganger ordet " + ord + " er i stringen er " + tellMønster + " ganger");

	}

}
