package varargs;

public class Main {

	public static void main(String[] args) {
		imprimir("a");
		// pode passar quanto parametros quiser
		imprimir("a", "b");

		String[] array = { "a", "c", "b" };

		imprimir(array);
	}

	private static void imprimir(String... texto) {
		for (int i = 0; i < texto.length; i++) {
			System.out.println(texto);
		}
	}
}
