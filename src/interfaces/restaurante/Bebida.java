package interfaces.restaurante;

import interfaces.restaurante.enums.SaborBebida;
import interfaces.restaurante.enums.Tamanho;

public class Bebida implements Item{

	protected Tamanho tam;
	protected SaborBebida sabor;
	
	public Bebida(SaborBebida sabor, Tamanho tam) {
		this.sabor = sabor;
		this.tam = tam;
	}
	
	public Tamanho getTamanho() {
		return tam;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}

	@Override
	public double getPreco() {
		return sabor.getCusto() + tam.getCusto();
	}

	@Override
	public String getDescricao() {
		return sabor.name() + " " + tam.name();
	}
	
}
