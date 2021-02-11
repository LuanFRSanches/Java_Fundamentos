package arquivo_escrita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String inputFile = "entrada.txt";
		String outputFile = "saida.txt";
		
	try(InputStream in = new FileInputStream(inputFile) ;
		OutputStream out = new FileOutputStream(outputFile)) {
		byte[]buffer = new byte[1024];	

		int bytesLidos;
		while((bytesLidos = in.read(buffer))> -1) {
			out.write(buffer,0,bytesLidos);
		}
	}
	}
}	
