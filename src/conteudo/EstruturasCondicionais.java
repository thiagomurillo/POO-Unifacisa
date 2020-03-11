package conteudo;

import java.util.Scanner;

public class EstruturasCondicionais {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();      //recebe a idade a partir do teclado

		if(idade < 2)
		  System.out.println("Indivíduo é um bebê");
		else if(idade < 12)
		  System.out.println("Indivíduo é uma criança");
		else if(idade < 13)
		  System.out.println("Indivíduo é um pré-adolescente");
		else if(idade < 18)
		  System.out.println("Indivíduo é um adolescente");
		else if(idade < 60)
		  System.out.println("Indivíduo é um adulto");
		else
		  System.out.println("Indivíduo é um idoso");
		
		
		int dia = scanner.nextInt();      //recebe dia a partir do teclado
		switch (dia) {
		  case 1:
		    System.out.println("Segunda-feira");
		    break;
		  case 2:
		    System.out.println("Terca-feira");
		    break;
		  case 3:
		    System.out.println("Quarta-feira");
		    break;
		  case 4:
		    System.out.println("Quinta-feira");
		    break;
		  case 5:
		    System.out.println("Sexta-feira");
		    break;
		  case 6:
		    System.out.println("Sabado");
		    break;
		  case 7:
		    System.out.println("Domingo");
		    break;
		  default:
		    System.out.println("O valor de dia não está entre 1 e 7.");
		}
	}

}
