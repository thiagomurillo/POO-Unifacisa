package heranca.versuscomposicao;

import java.util.ArrayList;
import java.util.List;

public class CorpoHumano {
	
	List<Orgao> orgaos = new ArrayList<Orgao>();
	
	//esse reuso pode mudar em tempo de execucao
	private Musculo musculo;
	
	public CorpoHumano(Musculo musculo) {
		super();
		this.musculo = musculo;
	}

	public void setMusculo(Musculo musculo) {
		this.musculo = musculo;
	}
	
	public void mover() {
		musculo.funcionar();
	}
	
	public static void main(String[] args) {
		
		CorpoHumano ch = new CorpoHumano(new Coracao(2,0.15,"bombear sangue"));
		ch.mover();
		ch.setMusculo(new Biceps(1.5, 0.2, "movimentar braco"));
		ch.mover();
	}

}
