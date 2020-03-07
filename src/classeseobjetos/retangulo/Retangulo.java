package classeseobjetos.retangulo;

public class Retangulo {
	
	private double largura, altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getPerimetro() {
		return altura+altura+largura+largura;
	}
	
	public double getArea() {
		return largura*altura;
	}
	
	public String toString() {
		return "Altura = "+altura+", largura = "+largura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
