package sobrecarga;

public class Matematica {

	int somar(int x, int y) {
		System.out.println("int soma(int x, int y");
		return x + y;
	}

	int soma(int x, int y, int z) {
		System.out.println("int soma(int x, int y, int z");
		return x + y + z;
	}

	double somar(double x, double y) {
		System.out.println("int soma double x, double y");
		return x + y;
	}
}
