package classeseobjetos.encapsulamento;

public class ContaCorrente {
	
	private double limite;			//default ou package private
	private double saldo;	
	private int numero;
	private String cliente;
	
	public ContaCorrente(double limite, int numero, String cliente) {
		if(limite < 0) {
			limite = 0;
		}
		this.limite = limite;
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public double debitar(double quantia) {
		if(verificaRetirada(quantia)) {
			saldo -= quantia;
			return quantia;
		} else {
			return 0;
		}		
	}
	
	public boolean transferir(double quantia, ContaCorrente conta2) {
		//se eh possivel sacar dessa conta, então
		//eh possivel transferir
		double valor = debitar(quantia);
		if(valor>0) {
			conta2.depositar(valor);
			return true;
		}
		
		return false;		
	}
	
	private boolean verificaRetirada(double quantia) {
		if(quantia > 0 && quantia <= (saldo + limite)) 
			return true;
		else
			return false;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
