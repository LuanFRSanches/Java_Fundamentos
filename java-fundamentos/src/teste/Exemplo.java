package teste;

public class Exemplo {
	public static void main(String[] args) {
		class Classe1 {
			public void m() {
				System.out.println(1);
			}
		}

		class Classe2 extends Classe1 {
			public void m() {
				super.m();
				System.out.println(2);
			}
		}
	}
}
