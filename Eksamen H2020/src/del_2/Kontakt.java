package del_2;

public class Kontakt {
	
	private String navn;
	private int kontaktnummer;
	
	public Kontakt(String navn, int kontaktnummer) {
		this.navn=navn;
		this.kontaktnummer=kontaktnummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getKontaktnummer() {
		return kontaktnummer;
	}

	public void setKontaktnummer(int kontaktnummer) {
		this.kontaktnummer = kontaktnummer;
	}
	
	public String toString() {
		String str = "Navn er: " + navn + "Kontaktnummer er: " + kontaktnummer;
		
		return str;
	}

}
