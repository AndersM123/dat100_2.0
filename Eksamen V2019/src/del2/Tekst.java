package del2;

public class Tekst extends Innlegg {

	private String tekst;

	Tekst(String bruker, String dato, String tekst) {
		super(bruker, dato);
		this.tekst = tekst;
	}

	public void skrivUt() {
		super.skrivUt();
		System.out.println(tekst);
	}
	
}
