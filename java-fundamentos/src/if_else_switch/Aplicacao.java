package if_else_switch;

public class Aplicacao {
	public static void main(String[] args) {

		int num = 10;
		if (num > 10) {
			System.out.println("O n�mero �  maior que 10");
		} else if (num < 10) {
			System.out.println("O n�mero � menor10");
		} else {
			System.out.println("O n�mero � 10");
		}
		
		int num2 = 15;
		switch (num) {
		case 5: 

			System.out.println("O n�mero � 5");
		break;
		case 10:
			System.out.println("O n�mero � 10");
		break;
		case 15:
			System.out.println("O n�mero e 15");
			break;
		default:
			System.out.println("O n�mero � outro");
		break;
		}
	}

}
