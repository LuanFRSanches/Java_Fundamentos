package teste;

public class Exemplo {
	static void m(String s) {
		s = s.concat("D");
	}

	public static void main(String[] args) {
		String s1 = "A"; 
		String s2 = "B";
		String s3 = "C";
		m(s2);
		System.out.print(s1 + s2 + s3);
	}
}
