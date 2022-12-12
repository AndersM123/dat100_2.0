package del_2;

public class Arrangement {

	private String navn;
	private Kontakt[] deltakere;
	private int antall;

	public Arrangement(String navn) {
		this.navn = navn;
		deltakere = new Kontakt[50];
		antall = 0;
	}

	public boolean leggTilKontakt(Kontakt k) {

		boolean full = false;

		if (antall < deltakere.length) {
			deltakere[antall] = k;
			full = false;
		} else {
			full = true;
		}

		return full;
	}

	public boolean finnes(String navn, int nummer) {
		boolean fant = false;
		int i = 0;

		while (i < antall && !fant) {
			Kontakt k = deltakere[i];

			if (k.getNavn().equals(navn) && k.getKontaktnummer() == nummer) {
				fant = true;
			} else {
				i++;
			}
		}
		return fant;
	}

	public boolean registrer(String navn, int nummer) {

		boolean reg = false;

		if (!finnes(navn, nummer)) {
			Kontakt k = new Kontakt(navn, nummer);
			reg = leggTilKontakt(k);
		}
		return reg;

	}

}
