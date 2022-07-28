package grunnleggende_oppgaver;

public class G1 {

	public static void main(String[] args) {

		int[] tabell = { 1, 3, 4, 7, 9, 10 };

		tabell[2] = tabell[2] + 3;

		System.out.println(tabell[2]);
		System.out.println();

		skrivUt(tabell);

		System.out.println();

		finnes(tabell, 3);

		System.out.println();

		skiftfortegn(tabell, 1);

	}

	public static void skrivUt(int[] tab) {

//		for (int i = 0; i < tab.length; i++) {

		for (int i : tab) {
			System.out.println(i);
		}
	}

	public static boolean finnes(int[] tabell, int tall) {
		boolean funnet = false;
		String noe = "false";
		int pos = 0;

		while (!funnet && pos < tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
				noe = "true";
			}
			pos++;
			System.out.println(noe);
		}
		return funnet;

	}

	public static int[] skiftfortegn(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] > 0) {
				tabell[i] = tabell[i] * (-1);
				System.out.println(tabell[i]);
			}
		}
		return tabell;
	}

}
