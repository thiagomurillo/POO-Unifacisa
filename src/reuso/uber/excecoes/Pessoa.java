package reuso.uber.excecoes;

import reuso.uber.ContaCorrente;
import reuso.uber.Data;

public class Pessoa {
	
	protected String nome, cpf;
	protected Data dataIngresso;
	protected ContaCorrente conta;
	
	public Pessoa(String nome, String cpf, ContaCorrente conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataIngresso = new Data();
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		// TODO formatar a String
		return super.toString();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Data getDataIngresso() {
		return dataIngresso;
	}
	
	public ContaCorrente getConta() {
		return conta;
	}
}
