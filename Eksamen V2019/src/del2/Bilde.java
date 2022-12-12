package del2;

public class Bilde extends Innlegg {

	private String url;

	Bilde(String url, String bruker, String dato) {
		super(bruker, dato);
		this.url = url;
	}

	public void skrivUt() {
		super.skrivUt();
		System.out.println(url);
	}
	
	
}
