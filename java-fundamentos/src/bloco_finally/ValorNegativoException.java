package bloco_finally;

@SuppressWarnings("serial")
public class ValorNegativoException extends Exception {

	private double valor;

	public ValorNegativoException(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
