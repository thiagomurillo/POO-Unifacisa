package excecoes.exercicios.questao3;

import java.util.Scanner;

public class IntervaloDeDiasApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		int dia = teclado.nextInt();
		System.out.print("Digite o mês: ");
		int mes = teclado.nextInt();
		System.out.print("Digite o ano: ");
		int ano = teclado.nextInt();

		Data data = new Data(dia, mes, ano);
		System.out
				.println("Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);
		teclado.close();
	}
}
