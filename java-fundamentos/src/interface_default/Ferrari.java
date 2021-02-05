package interface_default;



public class Ferrari implements Automovel {

	@Override
	public void acelerar() {
		System.out.println("Ferrari Acelerou");
		
	}

	@Override
	public void frear() {
		System.out.println("Ferrari freo");
		
	}

}
