package polimorfismo.zoo;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZZZZZzzzzZZZzzzz");
	}
	
	public void correr() {
		System.out.println("não vou correr");
	}

}
