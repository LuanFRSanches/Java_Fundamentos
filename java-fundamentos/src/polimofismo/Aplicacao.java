package polimofismo;

public class Aplicacao {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		Gato g = new Gato();

		falar(c);
		falar(g);

	}

	public static void falar(Animal a) {
		a.falar();
	}
}
