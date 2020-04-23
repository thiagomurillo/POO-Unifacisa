package excecoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestaExcecao {

	/**
	 * inicio do main inicio do metodo1 inicio do metodo2 0 1 2 3 4 5 6 7 8 9 lançou
	 * exceção que informa que o índice extrapolou o array
	 */

	public static void main(String[] args) {		
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	private static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
			System.out.println(intArray[i]);
		}
		System.out.println("fim do metodo2");
	}
	
	private String listFiles() throws FileNotFoundException{
		File f = new File("/home/eduardolfalcao");
		new FileInputStream(f);
		return f.listFiles().toString();
	}

}
