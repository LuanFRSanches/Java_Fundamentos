package threads_problemas;

public class Contador {
	private int valor;

	public synchronized void inclementar() {
		valor++;
	}

	public int getValor() {
		return valor;
	}

}
