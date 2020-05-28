package interfaces.restaurante.enums;

public enum Tamanho {

	GRANDE(2.8), MEDIO(2.0), PEQUENO(0);

	private double custo;

	private Tamanho(double custo) {
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}

}
