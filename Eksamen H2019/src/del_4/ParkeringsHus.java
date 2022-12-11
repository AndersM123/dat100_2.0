package del_4;

public class ParkeringsHus {

	private boolean[][] pplasser;

	// a)
	ParkeringsHus(int etasjer, int plasser) {
		pplasser = new boolean[etasjer][plasser];
	}

	// b)
	public void skrivUt() {

		for (boolean[] etasje : pplasser) {
			for (boolean plass : etasje) {
				System.out.println("|");
				if (plass) {
					System.out.println("X");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println("|");
			System.out.println();
		}
	}

	// c)
	public boolean erOpptatt(int etasje, int plass) {
		return pplasser[etasje][plass];
	}
	// d)
	public boolean parker(int etasje, int plass) {
		boolean parkert = false;

		if (!erOpptatt(etasje, plass)) {
			pplasser[etasje][plass] = true;
			parkert = true;
		}
		return parkert;
	}

	// e)
	public int antallLedige(int etasje) {

		boolean[] pdekk = pplasser[etasje];
		int antall = 0;

		for (boolean b : pdekk) {
		// antar at en true verdi betyr at plassen er ledig
			if (b) {
				antall++;
			}
		}

		return antall;

	}

	// f)
	public int[] statusLedige() {

		int[] ledige = new int[pplasser.length];

		for (int i = 0; i < ledige.length; i++) {
			ledige[i] = antallLedige(i);
		}

		return ledige;
	}
	
	
	
	
	

}