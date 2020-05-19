package polimorfismo.zoo;

public class Animal {
	
	protected String nome;
	protected int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("Animal emitindo som");
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+"; idade: "+idade;
	}

}
