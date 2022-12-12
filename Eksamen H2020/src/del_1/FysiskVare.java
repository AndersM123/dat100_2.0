package del_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FysiskVare extends Vare {

	private int antall;

	public FysiskVare(String navn, int nummer, double pris, int antall) {
		super(navn, nummer, pris);
		this.antall = antall;
	}

	public String toString() {
		String str = "Navn er: " + getNavn() + "\nvarenummer er: " + getNummer() + "\npris er: " + getPris();

		String ant;

		if (antall < 50) {
			ant = antall + "tilgjengelig";
		} else if (antall < 0) {
			ant = "ikke tilgjengelig";
		} else {
			ant = "50+ tilgjengelig";
		}

		return str + ant;
	}

	// Så fasit
	public static boolean lagre(Vare[] varer, String filnavn) {
		boolean skrevet = true;
		PrintWriter writer = null;

		try {
			writer = new PrintWriter(filnavn);

			for (Vare v : varer) {
				writer.print(v.toString());
				writer.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not open file: " + filnavn);
			skrevet = false;
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		return skrevet;
	}
}
