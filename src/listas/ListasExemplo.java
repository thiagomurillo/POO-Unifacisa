package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListasExemplo {
	
	public static void main(String[] args) {
		
		List<String> nomes = new LinkedList<String>();	//instanciando uma lista
		
		nomes.add("Eduardo");	//adiciona objeto String com conteúdo "Eduardo"
		nomes.add("Mariana");
		nomes.add("Joao");
		nomes.add("Eduardo");
		
		
		System.out.println("Nomes: "+nomes);	//toString
		System.out.println("Tamanho da lista de nomes: "+nomes.size());	
		System.out.println("A lista nomes contém a String \"Eduardo\"? "+nomes.contains("Eduardo"));
		System.out.println("Em que posição se encontra a String \"Eduardo\"? "+nomes.lastIndexOf("Eduardo"));
		System.out.println("Qual objeto está na posição 2 da lista? "+nomes.get(2));
		
		//remove é um método sobrecarregado
		System.out.println(nomes.remove(0));		//remove objeto no índice 0
		System.out.println(nomes.remove("Joao"));	//remove objeto String com conteúdo João				
		System.out.println("Nomes: "+nomes+"\n\n");
		
		//for each
		for(String nome : nomes) {
			System.out.println("Nome: "+nome);
		}
				
		nomes.clear();			//remove todos os objetos da lista 		
		System.out.println("Nomes: "+nomes);
		
		
		/**
		 * Wrappers
		 */
		
		Boolean b = new Boolean(true);
		Character c = new Character('c');
		Byte by = new Byte((byte) 10);
		Short sh = new Short((short) 10);
		Integer i = new Integer(10);
		Long l = new Long(10l);
		Float f = new Float(10.0f);
		Double d = new Double(10.0);
//		
//		Integer v1 = new Integer(20);
//		Integer v2 = new Integer(20);
//		
//		System.out.println(v1==v2);
//		
//
		//outro exemplo de autoboxing
		Integer um = 1;		//é mais recomendado em comparação a usar o construtor
		Long dois = 2l;		
		Float tres = 3.0f;
		Double quatro = 3.0;
		Boolean ligado = true;
		
		List<Integer> divisoresDez = new ArrayList<Integer>();	//é mais recomendado em comparação a usar o construtor
		divisoresDez.add(1);	//autoboxing
		divisoresDez.add(2);	//autoboxing
		divisoresDez.add(5);	//autoboxing
		divisoresDez.add(10);	//autoboxing
		
		for(int j : divisoresDez){	//unboxing: acontece uma atribuição de Integer para int
			System.out.println(j);
		}
		
		//outra forma
		int divisor = divisoresDez.get(1);	//unboxing: acontece uma atribuição de Integer para int
		
		
	}
	

}
