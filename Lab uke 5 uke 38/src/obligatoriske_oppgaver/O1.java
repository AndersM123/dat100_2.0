package obligatoriske_oppgaver;

import java.util.Arrays;

public class O1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 5, 4, 3, 2, 1 };
		int[] c = { 1, 5, 3, 4, 2 };

		skrivUt(a);
		tilStreng(a);
		summer(a);
		finnesTall(a, 1);
		posisjonTall(a, 6);
		erSortert(c);
		settSammen(b,c);
	}

	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	public static String tilStreng(int[] tabell) {

		return Arrays.toString(tabell);
	}

//	for løkke
//	public static int summer(int[] tabell) {
//		int sum = 0;
//		
//		for(int i=0; i<tabell.length; i++) {
//			sum +=tabell[i];
//		}
//		System.out.println(sum);
//		return sum;
//	}

// while løkke
//	public static int summer(int[] tabell) {
//
//		int sum = 0;
//		int i = 0;
//
//		while (tabell[i] < tabell.length) {
//			i++;
//			sum += tabell[i];
//
//		}
//// ???
//		System.out.println(sum + tabell[0]);
//		return sum + tabell[0];
//
//	}

	// utvidet for løkke
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i : tabell) {
			sum += tabell[i - 1];
			i++;
		}
		System.out.println(sum);
		return sum;

	}

	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;

		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] == tall) {
				funnet = true;
			}
		}
		return funnet;
	}

	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;

		while (i < tabell.length) {

			if (tabell[i] == tall) {
				System.out.println(i);
				return i;
			} else {
				i++;
			}
			i++;
		}
		System.out.println(-1);
		return -1;
	}

	public static boolean erSortert(int[] tabell) {

		boolean større = false;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] <= tabell[i + 1]) {
				større = true;
			} else {
				større = false;
			}

		}
		System.out.println(større);
		return større;
	}

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length;

		int[] spleisTab = new int[lengde];
		int pos = 0;

		for (int x : tabell1) {

			spleisTab[pos] = x;
			pos++;
		}
		for(int x : tabell2) {
			spleisTab[pos] = x;
			pos++;
		}
		System.out.println(Arrays.toString(spleisTab));
		return spleisTab;

	}
}
