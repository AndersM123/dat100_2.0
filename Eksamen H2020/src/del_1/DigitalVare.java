package del_1;

public class DigitalVare extends Vare {

	private String url;
	
	public DigitalVare(String navn, int nummer, double pris, String url) {
		super(navn, nummer, pris);
		this.url = url;
	}
	
	public String toString() {
		String str = "Navn er: " + getNavn() + "\nvarenummer er: "
				+ getNummer() + "\npris er: " + getPris() + 
				"\nwebadressen er: " + url;
		
		return str;
	}
	
	
}
