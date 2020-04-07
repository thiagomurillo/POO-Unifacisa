package conteudo;

import java.util.Arrays;

public class ManipulandoArrays {

	public static void main(String[] args) {
		
		int[] notasProva1 = new int[6]; // um array de inteiros
		String[] alunos = new String[] { "Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline" }; // um array de
																									// Strings		
		notasProva1[0] = 10;
		notasProva1[1] = 8;
		notasProva1[2] = 9;
		notasProva1[3] = 4;
		notasProva1[4] = 1;
		notasProva1[5] = 5;		

		alunos[3] = "Adriano";

		// for indexado
		for (int i = 0; i < 6; i++) {
			System.out.println("Aluno: " + alunos[i]);
		}

		// for indexado
		for (int i = 0; i < 6; i++) {
			System.out.println("Nota: " + notasProva1[i]);
		}
		
		// for-each
		for (String aluno : alunos) {
			System.out.println("Aluno: " + aluno);
		}

		// for-each
		for (int nota : notasProva1) {
			System.out.println("Nota: " + nota);
		}

		// for indexado
		for (int i = 0; i < 6; i++) {
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Nota: " + notasProva1[i]);
		}

		// for indexado
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Nota: " + notasProva1[i]);
		}

		String[] alunosClone = alunos.clone();
		// for-each
		for (String aluno : alunosClone) {
			System.out.println("Aluno clone: " + aluno);
		}
		
		
		 //String[] alunos = new String[] { "Joao", "Joana", "Andre", "Gustavo", "Mariana", "Aline" };
		 int[][] notasBimestre = new int [][] {{10, 5, 6, 8, 8, 5}, {9, 6, 5, 7, 8, 10}, {8, 8, 4, 9, 10, 9}};
		 
		 //notas de Joao: notasBimestre[0][0], notasBimestre[1][0], notasBimestre[2][0]
		 for(int i = 0; i < alunos.length; i++){
		 	System.out.println("Aluno: "+alunos[i]+"; média: "+
				(notasBimestre[0][i] + notasBimestre[1][i] + notasBimestre[2][i])/3);
		 }
		

		//métodos de instância do array
		System.out.println(alunos.toString());
		System.out.println(alunos == alunosClone);
		System.out.println(alunos.equals(alunosClone));

		//Arrays: métodos estáticos
		System.out.println(Arrays.equals(alunos, alunosClone));
		System.out.println("Antes de ordenar notas: "+Arrays.toString(notasProva1));
		Arrays.sort(notasProva1);
		System.out.println("Depois de ordenar notas: "+Arrays.toString(notasProva1));
		
		//exceções
		System.out.println(notasProva1[10]);	//ArrayIndexOutOfBoundsException:
		int [] arrayNaoInstanciado = null;
		System.out.println(arrayNaoInstanciado[0]);	//NullPointerException
		
		//performance
		int[] temp = new int [500000000];
		
		long inicio = System.currentTimeMillis();
		int pos = 500000000-1;
		temp[pos] = 50;
		for(int t : temp) {
			if(t>30)
				System.out.println(t);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println(fim-inicio);

	}

}
