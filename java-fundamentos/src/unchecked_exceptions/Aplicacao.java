package unchecked_exceptions;

public class Aplicacao {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		try {
			boolean iguais = Comparador.comparador(o1, o2);
			System.out.println(iguais);
		} catch (NullPointerException e) {
			System.out.println("O objeto é nulo");
		}

	}

}
