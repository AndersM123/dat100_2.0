package basis_oppgaver;

public class B1 {

	public static void main(String[] args) {
		boolean[][] audp;

		int ANTALL = 8;
		int RADER = 6;

		boolean[][] d111 = new boolean[RADER][ANTALL];

		boolean[][] aud = { { false, false, false, false }, // rad 0
				{ false, false, false, false }, // rad 1
				{ false, true, true, false }, // rad 2
				{ false, true, false, false }, // rad 3
		};

		antLedig(aud);
		prosentOpptatt(aud);
		f�rsteLedig(aud);
		System.out.println();
		System.out.println("finnes det et ledig sete?");
		finnesLedig(aud);
		System.out.println();
		System.out.println("finnes det minst to ledige seter?");
		finnes2Ledig(aud);

	}

	public static int antLedig(boolean[][] aud) {

		int ledig = 0;

		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				if (aud[i][j] == true) {
					ledig++;
				}
			}
		}
		System.out.println("Det er " + ledig + " ledige seter i salen");
		return ledig;

	}

	public static double prosentOpptatt(boolean[][] aud) {

		double opptatt = 0;
		double plasser = 0;
		double prosent = 0;

		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				plasser++;
				if (aud[i][j] == false) {
					opptatt++;
				}
			}
		}
		prosent = opptatt / plasser * 100;

		System.out.println(prosent + "%" + " av setene er opptatt");
		return prosent;

	}

	public static void f�rsteLedig(boolean[][] aud) {

		boolean ledig = false;
		int rad = 0;

		while (ledig == false && rad < aud.length) {
			int kol = 0;

			while (ledig == false && kol < aud[rad].length) {
				if (aud[rad][kol] == true) {
					ledig = true;
					System.out.println("Det f�rste ledige setet er p� " + "rad: " + rad + " kolonne: " + kol);
				}
				kol++;
			}
			rad++;
		}

	}

	public static boolean finnesLedig(boolean[][] aud) {

		boolean ledig = false;

//		for (int i = 0; i < aud.length; i++) {
//			for (int j = 0; j < aud[i].length; j++) {
//				if(aud[i][j] == true) {
//					ledig = true;
//				}
//			}
//		}

		for (boolean[] rad : aud) {
			for (boolean plass : rad) {
				if (plass == true) {
					ledig = true;
				} 
				
			}
		}

		System.out.println(ledig);
		return ledig;
	}

	public static boolean finnes2Ledig(boolean[][] aud) {

		boolean ledig = false;
		int antallLedig = 0;

//		for (int i = 0; i < aud.length; i++) {
//			for (int j = 0; j < aud[i].length; j++) {
//				if(aud[i][j] == true) {
//					ledig = true;
//				}
//			}
//		}

		for (boolean[] rad : aud) {
			for (boolean plass : rad) {
				if (plass == true) {
					antallLedig++;
					if (antallLedig > 1) {
						ledig = true;
					} 
				}
			}
		}

		System.out.println(ledig);
		return ledig;
	}

}
