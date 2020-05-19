package polimorfismo.mortalkombat;

public class Lutador {

	protected String nome;
	protected int vida;
	
	public Lutador(String nome) {
		this.nome = nome;
		this.vida = 100;
	}
	
	public String toString() {
		return "Lutador: "+nome+", vida: "+vida;
	}
	
	public void socar(Lutador oponente) {
		oponente.vida -= 5;
		System.out.println(nome+" acabou de socar "+ oponente.nome);
	}
	
	public void chutar(Lutador oponente) {
		oponente.vida -= 5;
		System.out.println(nome+" acabou de chutar "+ oponente.nome);
	}
	
	//demais funcoes
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
}
