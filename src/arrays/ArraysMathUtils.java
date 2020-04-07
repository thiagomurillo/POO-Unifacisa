package arrays;

import java.util.Arrays;

public class ArraysMathUtils {

	private static int getNumDivisores(int num) {
		int numDivisores = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i==0) {
				numDivisores++;
			}				
		}
		
		return numDivisores;
	}
	
	//15 ==> {1, 3, 5, 15}
	static int[] calculaDivisores(int num) {
		int tamanho = ArraysMathUtils.getNumDivisores(num);
		int[] divisores = new int[tamanho];
		int iDivisor = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num%i==0) {
				divisores[iDivisor] = i;
				iDivisor++;
			}				
		}
		
		return divisores;
	}
	
	static boolean temNumRepetido(double[] numeros) {
		//numBase ==> [1.1, 2.2, 3.3, 2.2]
		//numComparacao ==> [2.2, 3.3, 2.2]
		//[1.1, 2.2, 3.3, 2.2]
		
		for(int iBase = 0; iBase < numeros.length - 1; iBase++) {
			double numBase = numeros[iBase];
			for(int iComparacao = iBase + 1; iComparacao < numeros.length; iComparacao++) {
				double numComparacao = numeros[iComparacao];
				if(numBase == numComparacao)
					return true;
			}
		}
		
		return false;
	}
	
	//m1 [ null , null , null ]
	// linha0 [5, 4]
	// linha1 [0, 2]
	// linha2 [1, -1]
	//m2 
	// linha0 [0, -2]
	// linha1 [5, -3]
	// linha2 [-1, 0]
	//soma
	// [5, 2]
	// [5, -1]
	// [0, -1]
	static int[][] somaMatrizes(int[][] m1, int[][] m2){
		int[][] soma = new int[m1.length][];
		
		for(int linha = 0; linha < m1.length; linha++) {
			
			//descobri quantas colunas a linha0 de m1 possui
			int qtdadeColunas = m1[linha].length;
			//instanciei a linha (no índice "linha")
			soma[linha] = new int[qtdadeColunas];
			
			for(int coluna = 0; coluna < qtdadeColunas; coluna++) {
				soma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];				
			}
		}
		
		return soma;
	}
	
	//a [[0, -2], [5, -3], [-1, 0]]
	// linha0 [0, -2]
	// linha1 [5, -3]
	// linha2 [-1, 0]
	
	//i = 0; a[i]: [0, -2]; a.length: 3
	//a[i]: [0, -2]; a[i].length: 2
	static void arrayBidimensionalToString(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
//		int[] divisores = ArraysMathUtils.calculaDivisores(15);
//		System.out.println(Arrays.toString(divisores));
//		
//		int[][] m1 = new int[][] {
//			new int[] {5, 4}, 
//			new int[] {0, 2}, 
//			new int[] {1, -1}};
//			
//		int[][] m2 = new int[][] {
//			new int[] {0, -2},
//			new int[] {5, -3},
//			new int[] {-1, 0}};
//			
//		int[][] soma = ArraysMathUtils.somaMatrizes(m1, m2);
//		ArraysMathUtils.arrayBidimensionalToString(soma);
		
		double[] num = new double[] {1.1, 2.2, 3.3, 4.4};
		System.out.println(ArraysMathUtils.temNumRepetido(num));
		
	}
	
}
