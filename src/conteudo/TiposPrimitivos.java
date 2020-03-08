package conteudo;

import java.util.HashSet;
import java.util.Set;

public class TiposPrimitivos {
	
	public static void main(String[] args) {		
		System.out.println("Menor valor de um byte: "+Byte.MIN_VALUE);
		System.out.println("Maior valor de um byte: "+Byte.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um short: "+Short.MIN_VALUE);
		System.out.println("Maior valor de um short: "+Short.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um int: "+Integer.MIN_VALUE);
		System.out.println("Maior valor de um int: "+Integer.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um long: "+Long.MIN_VALUE);
		System.out.println("Maior valor de um long: "+Long.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um float: "+Float.MIN_VALUE);
		System.out.println("Maior valor de um float: "+Float.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um double: "+Double.MIN_VALUE);
		System.out.println("Maior valor de um double: "+Double.MAX_VALUE+"\n");
		
		System.out.println("Menor valor de um char: "+Character.MIN_VALUE);
		System.out.println("Maior valor de um char: "+Character.MAX_VALUE+"\n");
		
		for(int i = 0; i <= Math.pow(2, 16)-1; i++) {
			char a = (char) i;
			System.out.println("Valor de char a = "+i+"? "+a);			
		}	
		
	}

	
	
}
