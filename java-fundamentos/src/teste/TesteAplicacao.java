package teste;

public class TesteAplicacao {
	int y = 10;

	void mudar(TesteAplicacao e) {
		e.y = y + 5;
	}

	public static void main(String[] args) {
		TesteAplicacao e1 = new TesteAplicacao();
		TesteAplicacao e2 = new TesteAplicacao();
		e1.mudar(e2);
		System.out.println(e1.y);
		System.out.println(e2.y);
	}

}
