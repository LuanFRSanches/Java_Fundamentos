package interfaces;

public class Ferrari implements Carro {

	@Override
	public void virarEsquerda() {
		System.out.println("ferrari viro a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("ferrari viro a direita");

	}

	@Override
	public void acelerar() {
		System.out.println("ferrari viro a acelerou");

	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu porta");
	}
	@Override
	public double getPreco() {
			return 10000000;
	}
}
