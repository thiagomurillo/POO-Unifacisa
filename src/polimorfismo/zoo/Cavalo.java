package polimorfismo.zoo;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("INririririri");
	}
	
	public void correr() {
		System.out.println("Cavalo trotando");
	}

}
