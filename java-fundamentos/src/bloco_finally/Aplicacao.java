package bloco_finally;



public class Aplicacao {
	public static void main(String[] args) throws Exception {
		ContaBancaria c = new ContaBancaria(1000);

		try {
			c.sacar(50);
			System.out.println("Saque realizado com sucessso");
			System.out.println(c.getSaldo());

		} finally {
			System.out.println(c.getSaldo());
		}

	}
}
