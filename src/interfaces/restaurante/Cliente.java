package interfaces.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<Item> pedidos;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.pedidos = new ArrayList<Item>();
	}
	
	public void adicionarPedido(Item i) {
		pedidos.add(i);
	}
	
	public List<Item> getPedidos() {
		return pedidos;
	}
}
