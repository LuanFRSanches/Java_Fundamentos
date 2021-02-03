package parametros;

public class Aplicacao {

	public static void main(String[] args) {
		Operacao o = new Operacao();

		int x = 10;
		o.trocar(x);

		System.out.println(x);
	}

}
