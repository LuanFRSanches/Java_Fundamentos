package heranca;

public class Aplicacao {

	public static void main(String[] args) {

		Veiculo v = new Veiculo();

		v.setModelo("BBB");
		v.setMarca("AAA");
		v.setAno(2000);

		v.buzinar();

		v.imprimirDados();
		Motocicleta m = new Motocicleta();
		m.buzinar();
		m.empinar();

		m.empinar();

		Caminhao cam = new Caminhao();
		cam.buzinar();
	}

}
