package excecoes.exercicios.questao1;

import java.util.Scanner;

public class NomeDoMesApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número do mês: ");
		Mes mes = new Mes(teclado.nextInt());
		System.out.println("Nome do mês: " + mes.getNome());
		teclado.close();
	}
}