package interfaces.restaurante;

import interfaces.restaurante.enums.Carboidrato;
import interfaces.restaurante.enums.Proteina;

//Refeicao implementa as funções de Item
public class Refeicao implements Item{
	
	private double desconto;
	private Proteina prot;
	private Carboidrato carb;
	
	public Refeicao(Proteina prot, Carboidrato carb) {
		this.prot = prot;
		this.carb = carb;
		this.desconto = 0.2;
	}
	
	@Override
	public double getPreco() {
		return prot.getCusto() + carb.getCusto();
	}

	@Override
	public String getDescricao() {
		return prot.name()+" com "+carb.name();
	}

	public Proteina getProteina() {
		return prot;
	}

	public Carboidrato getCarboidrato() {
		return carb;
	}

}
