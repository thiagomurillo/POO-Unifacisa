package interfaces.restaurante.enums;

public enum SaborBebida {
	
	COCA(5.0), GURANA(4.5), FANTA(4.0), HEINEKEN(6.0), WHISKY(10.0);
	
	private double custo;	
	
	private SaborBebida(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}

}
