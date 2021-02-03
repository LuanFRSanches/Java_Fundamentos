package modificadores;

public class Aplicacao {
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();

		c.setNumConta(54312);
		c.setAtiva(true);

		c.sacar(100);
		c.getSaldo();

	}
}
