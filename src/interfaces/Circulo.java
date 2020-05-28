package interfaces;

public class Circulo implements Forma{

	private double r;
	
	public Circulo(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*r;
	}

	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

}
