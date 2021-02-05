package interface_default;

public class Porsche implements Automovel{

	@Override
	public void acelerar() {
		System.out.println("Porsche Acelerou");
		
	}

	@Override
	public void frear() {
		System.out.println("Porsche freo");
		
	}
}
