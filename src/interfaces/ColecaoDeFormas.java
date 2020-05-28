package interfaces;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeFormas {
	
	private List<Forma> formas;

	public ColecaoDeFormas() {
		super();
		this.formas = new ArrayList<Forma>();
		
		formas.add(new Quadrado(5));
		formas.add(new Triangulo(5));
		formas.add(new Circulo(5));
	}
	
	public void calcularPerimetro() {
		for(Forma f : formas) {
			System.out.println(f.getPerimetro());
		}
	}
	
	public void calcularArea() {
		for(Forma f : formas) {
			System.out.println(f.getArea());
		}
	}
	
	public static void main(String[] args) {
		ColecaoDeFormas cf = new ColecaoDeFormas();
		cf.calcularPerimetro();
		cf.calcularArea();
	}

}
