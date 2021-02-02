package switch_expressions;

public class Aplicacao {
	public enum DiaDaSemana {
		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public static void main(String[] args) {

		DiaDaSemana d = DiaDaSemana.SEGUNDA;

		switch (d) {
		case SEGUNDA -> {
			System.out.println(1);
			System.out.println("seg");
		}
		case TERCA -> System.out.println(2);
		default -> System.out.println("Outros");
		}
		int i = switch (d) {
		case SEGUNDA -> 1;
		case TERCA -> 2;
		default -> 0;
		};
		System.out.println(i);
	}

}
