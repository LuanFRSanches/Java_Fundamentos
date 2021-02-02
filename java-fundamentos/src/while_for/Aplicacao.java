package while_for;

public class Aplicacao {
	public static void main(String[] args) {

		int x = 0;

		// WHILE
		while (x <= 10) {
			System.out.println(x);
			x++;
		}

		// DO WHILE
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);

		// FOR
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 0, j = 10; i < 10; i++, j--) {
			System.out.println(i + " - " + j);
		}
	}

}
