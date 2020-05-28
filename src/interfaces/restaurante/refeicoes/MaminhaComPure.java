package interfaces.restaurante.refeicoes;

import interfaces.restaurante.Refeicao;
import interfaces.restaurante.enums.Carboidrato;
import interfaces.restaurante.enums.Proteina;

public class MaminhaComPure extends Refeicao{
	
	public MaminhaComPure() {
		super(Proteina.MAMINHA, Carboidrato.PURE);
	}	
}
