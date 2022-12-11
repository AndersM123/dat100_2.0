package del_2;

public class Oppgave_4 {

	public static void main(String[] args) {
		double x = 3.5;
		double y = 2.3;
		double z = 7.9;
		
		min(x,y,z);
		
	}

	public static double maks(double x, double y) {
		double m = x;
		if (y > m) {
			m = y;
		}
		return m;
	}
	
	public static double min(double x, double y, double z) {
		
		double m = x;
		
		if(y < x && y < z) {
			m = y;
		} else if(z < x && z < y) {
			m = z;
		} else if(x < z && x < y) {
			m = x;
		}
		System.out.println(m);
		return m;
	}
}
