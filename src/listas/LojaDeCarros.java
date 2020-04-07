package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import classeseobjetos.construtores.Carro;

public class LojaDeCarros {
	
	List<Carro> carrosDisponiveis;
	List<Carro> carrosVendidos;
	
	public LojaDeCarros() {
		this.carrosDisponiveis = new ArrayList<Carro>();
		this.carrosVendidos = new ArrayList<Carro>();
	}
	
	void adicionarCarro(Carro carro) {
		carrosDisponiveis.add(carro);
	}
	
	void exibirCarrosDisponíveis() {
		for(Carro c: carrosDisponiveis) {
			System.out.println(c);
		}
	}
	
	Carro venderCarro(int id) {
		Iterator<Carro> it = carrosDisponiveis.iterator();
		while(it.hasNext()) {
			Carro c = it.next();
			if(c.id == id) {
				it.remove();
				return c; 
			}
		}
		return null;
	}
}
