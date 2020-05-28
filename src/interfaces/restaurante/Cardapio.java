package interfaces.restaurante;

import java.util.ArrayList;
import java.util.List;

import interfaces.restaurante.enums.Carboidrato;
import interfaces.restaurante.enums.Proteina;
import interfaces.restaurante.enums.SaborBebida;
import interfaces.restaurante.enums.Tamanho;

public class Cardapio {
	
	private List<Item> cardapio;
	private List<Bebida> bebidas;
	private List<Refeicao> refeicoes;
	
	public Cardapio() {
		this.bebidas = new ArrayList<Bebida>();
		this.bebidas.add(new Bebida(SaborBebida.COCA, Tamanho.PEQUENO));
		this.bebidas.add(new Bebida(SaborBebida.COCA, Tamanho.MEDIO));
		this.bebidas.add(new Bebida(SaborBebida.COCA, Tamanho.GRANDE));
		this.bebidas.add(new Bebida(SaborBebida.FANTA, Tamanho.PEQUENO));
		this.bebidas.add(new Bebida(SaborBebida.FANTA, Tamanho.MEDIO));
		this.bebidas.add(new Bebida(SaborBebida.FANTA, Tamanho.GRANDE));
		
		this.refeicoes = new ArrayList<Refeicao>();
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.PURE));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.BATATA));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.ARROZ));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.PURE));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.FEIJAO));
		this.refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.BATATA));
		
		this.cardapio = new ArrayList<Item>();
		this.cardapio.addAll(bebidas);
		this.cardapio.addAll(refeicoes);
	}
	
	public List<Item> getCardapio() {
		return cardapio;
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}

}
