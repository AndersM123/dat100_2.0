package grunnleggende_oppgaver;

import java.util.Arrays;

public class G1 {

	public static void main(String[] args) {

		int a = 5;
		String s = "Hei";
	
		System.out.println(s.length());
		
	}
}
//		double[][] obs = { 
//				{ 1.4, 1.7, 1.9, 2.0 }, 
//				{ 5.4, 7.8, 9.8, 7.9, 3.0 }, 
//				{ -1.7, -1.7, -2.8 } 
//				};
//
//		skrivUt(obs);
//		System.out.println();
////Skriver ut 3 fordi det er 3 forskjellige tabeller inndelt i en 2d tabell.
//		System.out.println(obs.length);
//		System.out.println();
////Skriver ut lengden p� de forskjellige tabellene inni 2d tabellen obs.
//		System.out.println(obs[0].length);
//		System.out.println(obs[1].length);
//		System.out.println(obs[2].length);
//
//		finnes(obs, 10);
//		swap(obs,0,2);
//		System.out.println();
//		skrivUt(obs);
//	}
//
//	public static void skrivUt(double[][] tabell) {
//
////		for (int i = 0; i < tabell.length; i++) {
////			for (int j = 0; j < tabell[i].length; j++) {
////
////				System.out.println(tabell[i][j] + " ");
////			}
////			System.out.println();
////		}
//
//		for (double[] i : tabell) {
//			for (double j : i) {
//				System.out.println(j);
//			}
//		}
//
//	}
//
//	public static boolean finnes(double[][] obs, double limit) {
//
//		boolean funnet = false;
//
//		for (int i = 0; i < obs.length; i++) {
//			for (int j = 0; j < obs[i].length; j++) {
//
//				if (obs[i][j] > limit) {
//					funnet = true;
//				}
//
//			}
//		}
//		System.out.println(funnet);
//		return funnet;
//
//	}
//
//	
//	public static void swap(double[][] tabell, int radA, int radB) {
//
//		double[] temp = tabell[radA];
//		tabell[radA] = tabell[radB];
//		tabell[radB] = temp;
//		
//	}
	
//}
