package del3;

public class test {

	public static void e() {
		String[] sTab = new String[4];
		sTab[0] = "a";
		sTab[1] = "ab";
		sTab[2] = "abc";
		int totalLengde = 0;
		try {
			for (int i = 0; i < sTab.length; i++) {
				totalLengde += sTab[i].length();
				System.out.println("Lengde så langt: " + totalLengde);
			}
			System.out.println("Total lengde av strengene: " + totalLengde);
		} catch (ArithmeticException e) {
			System.out.println("Unntak nr 1 kasta.");
		} catch (NullPointerException e) {
			System.out.println("Unntak nr 2 kasta.");
		} catch (Exception e) {
			System.out.println("Unntak nr 3 kasta.");
		}
	}

	public static void main(String[] args) {
		e();
	}

}
