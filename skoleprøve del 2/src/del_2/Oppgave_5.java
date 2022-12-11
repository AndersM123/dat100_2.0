package del_2;

public class Oppgave_5 {

	public static void main(String[] args) {
		
		double r = 1.5;
		
		areal_sirkel(r);

	}
	
	public static double areal_sirkel(double r) {
		
		double pi = Math.PI;
		double areal = pi*(Math.pow(r, 2));
		
		System.out.println(areal);
		return areal;
		
	}

}
