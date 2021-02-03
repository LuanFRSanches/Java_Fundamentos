package sobrecarga;

public class Aplicacao {
	public static void main(String[] args) {
		Matematica m = new Matematica();

		int soma = m.somar(10, 20);
		int soma1 = m.soma(2, 34, 5);
		double soma3 = m.somar(10.0, 20.10);

	}
}
