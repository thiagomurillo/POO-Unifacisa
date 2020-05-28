package interfaces;

public class Quadrado implements Forma{

	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return 4*lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

}
