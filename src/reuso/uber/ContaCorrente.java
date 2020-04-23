package reuso.uber;

import reuso.uber.excecoes.Pessoa;
import reuso.uber.excecoes.SenhaInvalidaException;
import reuso.uber.excecoes.ValorInvalidoException;

public class ContaCorrente {

	private Pessoa pessoa;
	private String senha;
	private double saldo;
	private Data dataCriacao;	
	
	public ContaCorrente(String senha) {
		super();
		this.senha = senha;
		this.saldo = 500;
		this.dataCriacao = new Data();
	}

	public void transferir(double valor, String senha, ContaCorrente conta) 
			throws SenhaInvalidaException, ValorInvalidoException {
		if(!this.senha.equals(senha)) {
			throw new SenhaInvalidaException("A senha da conta de "+pessoa.getNome()+" não é "+senha+"!");
		}
		if(valor > this.saldo) {
			throw new ValorInvalidoException("Saldo insuficiente: "+saldo+"; tentativa de transferencia de valor: "+ valor);
		}
		if(valor <= 0) {
			throw new ValorInvalidoException("Não faz sentido transferir esse valor: "+ valor);
		}
		
		this.saldo -= valor;
		conta.saldo += valor;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += "Pessoa: "+pessoa+"\n";
		output += "Saldo: "+saldo+"\n";
		output += "Data criacao conta: "+dataCriacao+"\n";
		return output;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
//	public static void main(String[] args){
//
//		ContaCorrente contaEduardo = new ContaCorrente("Eduardo", "8723643872", "edu123");
//		ContaCorrente contaMariana = new ContaCorrente("Mariana", "4398723", "mari123");
//		
//		try {
//			contaEduardo.transferir(100, "eduardo123", contaMariana);
//		}catch(ValorInvalidoException | SenhaInvalidaException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(contaEduardo);
//		System.out.println(contaMariana);
//		
//		
//	}
}
