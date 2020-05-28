package interfaces;

public class Triangulo implements Forma {

	private double lado;
	
	public Triangulo(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return lado*3;
	}

	@Override
	public double getArea() {
		return lado * lado / 2;
	}
	
}
