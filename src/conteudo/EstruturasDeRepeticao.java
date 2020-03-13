package conteudo;

import java.util.Scanner;

public class EstruturasDeRepeticao {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int notaAluno = 0;
		double media = 0;
		int contador = 0;
		do{		  
		  notaAluno = scanner.nextInt();      //recebe a nota a partir do teclado
		  if(notaAluno>=0) {
			  media += notaAluno;
			  contador++;
		  }
		} while(notaAluno>=0); 				  //pára quando a nota for negativa;

		if(contador!=0)
			media /= contador;
		System.out.println("Media: "+media);
		
		
		
		notaAluno = 0;
		media = 0;
		contador = 0;
		while(notaAluno>=0){                  //pára quando a nota for negativa
		  notaAluno = scanner.nextInt();      //recebe a nota a partir do teclado
		  if(notaAluno>=0) {
			  media += notaAluno;
			  contador++;
		  }
		} 

		if(contador!=0)
			media /= contador;
		System.out.println("Média: "+media);
		
		
		System.out.println("Pares entre 0 e 100");
		for(int i = 0; i <= 100; i++){
			  if(i%2==0)
			    System.out.print(i+", ");
		}
	}

}
