package arrays;

public class JogoDaVelha {
	
	private char [][] tabuleiro;
	private boolean vezJogador1;
	
	public JogoDaVelha() {
		this.tabuleiro = new char [3][3];
		this.vezJogador1 = true;
	}
	
//	boolean jogar(int linha, int coluna) {
//		
//		char simbolo;		
//		if(vezJogador1) {
//			simbolo = 'x';
//		} else {
//			simbolo = 'o';
//		}
//		
//		if(linha < 3 && linha >= 0) {
//			if(coluna < 3 && coluna >= 0) {
//				tabuleiro[linha][coluna] = simbolo;
//			}	
//		}
//	}
	
	boolean detectaFimJogo() {
		return false;
		
		//se a casa mais a esquerda contem algum simbolo diferente de vazio e o simbolo das colunas 0, 1 e 2 são iguais
//		if(tabuleiro[0][0] != '\u0000') {
//			//alguma linha horizontal preenchida
//			if(	(tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][0] == tabuleiro[0][2]) ||
//					(tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][0] == tabuleiro[1][2]) ||
//					(tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][0] == tabuleiro[2][2])) {
//				return true;			
//			}
//			//alguma linha vertical preenchida
//			else if(	(tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[0][0] == tabuleiro[2][0]) ||
//					(tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[0][1] == tabuleiro[2][1]) ||
//					
//					(tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][0] == tabuleiro[2][2])) {
//				
//			}
//		}	
	}
	
//	public static void main(String[] args) {
//		JogoDaVelha jogo = new JogoDaVelha();
//		do {
//			//recebe do teclado linha e coluna
//			int linha = 0;
//			int coluna = 0;
//			
//			jogo.jogar(linha, coluna);
//		}while(!jogo.detectaFimJogo());
//	}

}
