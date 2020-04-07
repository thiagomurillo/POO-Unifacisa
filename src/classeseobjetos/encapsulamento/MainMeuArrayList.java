package classeseobjetos.encapsulamento;

public class MainMeuArrayList {

	public static void main(String[] args) {

		MeuArrayList lista = new MeuArrayList();
		
		System.out.println(lista.getTamanho());		//0
		
		for(int i = 1; i <= 23; i++) {
			lista.add(i*2);
		}
		
		System.out.println(lista.getTamanho());		//23
		System.out.println(lista.get(10));			//22
		
		System.out.println(lista);
		
		lista.substituir(0, 432984329);
		System.out.println("Lista depois de substituição: "+lista);
		
		lista.remover(0);
		System.out.println("Lista depois de remoção: "+lista);
		

	}

}
