package reuso.uber.excecoes;

public class Uber {
	
	private List<Corrida> corridasPendentes;
	
	public void solicitarCorrida(Corrida c) {
		corridasPendentes.add(c);
	}

}
