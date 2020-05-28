package interfaces.restaurante.enums;

public enum Carboidrato {
	
	FEIJAO(2.0), ARROZ(1.5), PURE(1.5), BATATA(1.0);
	
	private double custo;
	
	private Carboidrato(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}

}
