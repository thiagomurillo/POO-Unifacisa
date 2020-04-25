package excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaFileNotFounException {
	
	public static void main(String[] args) throws FileNotFoundException{
		abreArquivo("arquivo.txt");
	}
	
	private static FileInputStream abreArquivo (String arquivo) throws FileNotFoundException{
		if(arquivo==null)
			throw new NullPointerException();
		return new FileInputStream(arquivo);
	}

}
