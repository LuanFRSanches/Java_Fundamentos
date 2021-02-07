package checked_exceptions;

public class Aplicacao {

	public static void main(String[] args) {
		Banco banco = new Banco();

		try {
			banco.realizarOpercao();

		} catch (BancoException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			System.out.println(e.getCause());
		}
	}
}