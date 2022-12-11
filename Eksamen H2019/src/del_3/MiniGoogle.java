package del_3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MiniGoogle {

	private WebDokument[] websider;
	private int antall = 0;

	public MiniGoogle(int n) {
		this.websider = new WebDokument[n];
		this.antall = 0;
	}

	public void sok(String sokeord) {
		for (int i = 0; i < antall; i++) {
			if (websider[i].finnes(sokeord)) {
				System.out.println("Fant ordet: " + websider[i].getUrl());
			} else {
				System.out.println("Fant ikke ordet du lette etter");
			}
		}
	}

	public String beste(String sokeord) {

		String storste = null;
		int besteantall = 0;

		for (int i = 0; i < antall; i++) {

			if (websider[i].finnes(sokeord)) {

				if (websider[i].frekvens(sokeord) > besteantall) {
					storste = websider[i].getUrl();
					besteantall = websider[i].frekvens(sokeord);
				}
			}
		}
		return storste;

	}

	public WebDokument indekser(WebDokument webside) {

		WebDokument fjernet = null;

		if (antall < websider.length) {
			websider[antall] = webside;
			antall++;
		} else {
			int i = random(websider.length);
			fjernet = websider[i];
			websider[i] = webside;
		}
		return fjernet;

	}

	public String[] google(String[] sokeord) {

		ArrayList<String> urllist = new ArrayList<String>();

		for (int i = 0; i < antall; i++) {
			if (finnesAlle(websider[i], sokeord)) {
				urllist.add(websider[i].getUrl());
			}
		}

		String[] urlarray = new String[urllist.size()];

		for (int i = 0; i < urllist.size(); i++) {
			urlarray[i] = urllist.get(i);
		}
		return urlarray;
	}

	private boolean finnesAlle(WebDokument webside, String[] sokeord) {

		for (String s : sokeord) {
			if (!webside.finnes(s)) {
				return false;
			}
		}
		return true;

	}

}
