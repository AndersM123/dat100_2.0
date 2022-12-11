package del_1;

public class Test {

	public static void main(String[] args) {
		
		metodeB();
	}
	
	public static void metodeA(int x) {
		if (x < 0) {
			throw new ArithmeticException("X er negativ");
		} else {
			System.out.print(1);
		}
		System.out.print(2);
	}

	public static void metodeB() {
		int[] tab = { 0, 1, -1, 2, 3 };
		try {
			for (int i = 0; i < tab.length; i++) {
				metodeA(tab[i]);
				System.out.print(3);
			}
		} catch (ArithmeticException exception) {
			System.out.println(4);
		} catch (Exception exception) {
			System.out.println(5);
		}
	}
}
