package del_1;

public class Vare {

	private String navn;
	private int nummer;
	private double pris;

	public Vare(String navn, int nummer, double pris) {

		this.navn = navn;
		this.nummer = nummer;
		this.pris = pris;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}
	
	
	public String tostring() {
		String str = "navn: " + navn + "Varenummer er: " 
				+ nummer + "pris er: " + pris;
		
		return str;
	}

}
