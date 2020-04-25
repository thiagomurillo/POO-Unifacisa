package excecoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyTeste {

	public static void main(String[] args) {

		File file = new File("/home/eduardo/Documentos/aulas-facisa");
		BufferedReader br = null;
		String output = "";
		try {
			br = new BufferedReader(new FileReader(file));
			String st = "";
			while ((st = br.readLine()) != null) {
				output += st+"\n";
			}
		} catch(IOException e){
			output += "Mais informações sobre as aulas podem ser encontradas aqui: "
					+ "https://github.com/eduardolfalcao/POO-Unifacisa";
			e.printStackTrace();
		} finally {
			//nesse escopo geralmente fechamos conexão com socket, banco de dados, etc
		}

		System.out.println("Aulas facisa: "+output);

	}

}
