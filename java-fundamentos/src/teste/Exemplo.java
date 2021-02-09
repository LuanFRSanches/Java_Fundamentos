package teste;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exemplo {
	public static void read() throws Exception {
		try {
			throw new IOException();
		} catch (FileNotFoundException e) {
			System.out.println("catch 1");
			return;
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			read();
		} catch (FileNotFoundException f) {
			System.out.println("catch 2");
		} finally {
			System.out.println("finally");
		}
	}
}
