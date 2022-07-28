package obligatoriske_oppgaver;

public class O1B {

	public static void main(String[] args) {
		int[][] matrise = { { 1, 2, 3 }, // rad 0
				{ 4, 5, 6 }, // rad 1
				{ 7, 8, 9 }, // rad
		};
		int[][] matrise2 = { { 1, 1, 3 }, // rad 0
				{ 4, 5, 6 }, // rad 1
				{ 7, 8, 9 }, // rad
		};
//		skrivUtv1(matrise);
//		tilStreng(matrise);
//		skaler(2, matrise);
//		erLik(matrise, matrise2);
		speile(matrise);

	}

	public static void skrivUtv1(int[][] matrise) {
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.println(" " + j);
			}
		}
	}

	public static String tilStreng(int[][] matrise) {

		String mat = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				mat += " " + matrise[i][j];
			}
		}
		System.out.println(mat);
		return mat;
	}

	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] mat = matrise;
		String m = "";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				mat[i][j] *= tall;
				// for � se om det ble riktig
				m += " " + mat[i][j];
			}
		}
		System.out.println(m);
		return mat;

	}

	public static boolean erLik(int[][] mat1, int[][] mat2) {

		boolean lik = true;

		if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
			System.out.println("matrisene er ulik");
		} else {

			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat1[i].length; j++) {
					if (mat1[i][j] != mat2[i][j]) {
						lik = false;
					}

				}
			}
			System.out.println(lik);
		}
		if (lik == true) {
			System.out.println("matrisene er lik");
		} else {
			System.out.println("matrisene er ikke lik");
		}

		return lik;

	}

	
//funker ikke
	public static int[][] speile(int[][] matrise) {

		int[][] mat = matrise;
		int rad = matrise.length;
		int kol = matrise[0].length;

		System.out.println("start matrise");
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
			}
			System.out.println();
		}
		for(int j = 0; j < matrise.length; j++) {
			for(int i = 0; i < matrise.length; i++) {
				mat[i][matrise.length-1-j] = matrise[i][j];
			}
		}
		System.out.println("speilet matrise");
		for(int i=0; i < matrise.length; i++) {
			for(int j =0; j < matrise[i].length; j++) {
				System.out.println(mat[i][j]);
			}
			System.out.println();
		}
		return mat;
	}

}
