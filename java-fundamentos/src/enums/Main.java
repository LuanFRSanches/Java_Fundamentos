package enums;

public class Main {
	enum Sexo {
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;

		int num = DiaDaSemana.QUARTA.getNum();
		System.out.println(num);

		String s = "TERCA";
		DiaDaSemana.valueOf(s);

	}

}
