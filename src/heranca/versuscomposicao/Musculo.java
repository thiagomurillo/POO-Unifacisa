package heranca.versuscomposicao;

public class Musculo extends Orgao{

	public Musculo(double peso, double dimensao, String objetivo) {
		super(peso, dimensao, objetivo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void funcionar() {
		System.out.println("Musculo funcionando para alcancar "+objetivo);
	}	

}
