package heranca.versuscomposicao;

public class Orgao {
	
	protected double peso, dimensao;
	protected String objetivo;
	
	public Orgao(double peso, double dimensao, String objetivo) {
		super();
		this.peso = peso;
		this.dimensao = dimensao;
		this.objetivo = objetivo;
	}
	
	public void acionar() {
		System.out.println("Orgao funcionando com o  objetivo "+ objetivo);
	}
	
}
