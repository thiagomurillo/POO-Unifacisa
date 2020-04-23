package reuso.uber.excecoes;

import reuso.uber.ContaCorrente;

public class Passageiro extends Pessoa{
	
	private Uber uber;
	
	public Passageiro(String nome, String cpf, ContaCorrente conta) {
		super(nome, cpf, conta);
	}
	
//	public void solicitarCorrida(String origem, String destino, double km) {
//		Corrida c = new Corrida();
//		uber.solicitarCorrida(c);
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Uber u = new Uber();
//		Passageiro p = new Passageiro();
//		p.solicitarCorrida(origem, destino, km);
//	}

}
