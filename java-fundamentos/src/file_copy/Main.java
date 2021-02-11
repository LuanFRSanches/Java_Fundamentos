package file_copy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// FileInputStream fin = new FileInputStream("entrada.txt");
		// FileOutputStream fout = new FileOutputStream("saida.txt");
		// transfer(fin, fout);

		// FileInputStream fin = new FileInputStream("entrada.txt");
		// OutputStream count = System.out;
		// transfer(fin, null);

		// InputStream cin = System.in;
		// FileOutputStream fout = new FileOutputStream("saida.txt");
		// transfer(cin, fout);Fs

		FileInputStream fin = new FileInputStream("entrada.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		trasfer(fin, bout);
		
		byte[] bytes = bout.toByteArray();
		String s = new String(bytes);
		System.out.println(s);
	}

	private static void transfer(InputStream in, OutOfMemoryError out) throws IOException {
		byte[] buffer = new byte[1024];

		int bytesLidos;

		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}
}
