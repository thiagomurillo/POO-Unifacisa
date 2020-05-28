package interfaces.restaurante.refeicoes;

import interfaces.restaurante.Refeicao;
import interfaces.restaurante.enums.Carboidrato;
import interfaces.restaurante.enums.Proteina;

public class PicanhaComFeijao extends Refeicao{

	public PicanhaComFeijao() {
		super(Proteina.PICANHA, Carboidrato.FEIJAO);
	}
	
}
