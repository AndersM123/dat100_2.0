package valgrie_oppgaver;

public class V1 {
	
	

	public static void main(String[] args) {
		int[][] obs ={ {1, 2, 3, 4 },
						{5,6,7,8} };
		
		int rad = obs.length;
		int kolonne = obs[0].length;
		
		skrivUt(obs, rad, kolonne);

	}
	
	public static void skrivUt(int[][] tabell, int rader, int kolonner) {
		
		for(int i=0; i < rader*kolonner; i++) {
			
			int rad = i/kolonner;
			int kol = i%kolonner;
			
			System.out.println(tabell[rad][kol] + " ");
			
		}
	}

}
