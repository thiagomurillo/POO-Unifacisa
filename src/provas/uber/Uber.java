package provas.uber;

import java.util.ArrayList;
import java.util.List;

public class Uber {

	private Corrida[] corridas;
	private int tamanho;

	public Uber() {
		this.corridas = new Corrida[10];
		this.tamanho = 0;
	}

	public void solicitarCorrida(Corrida c) {
		// extrapolei o meu array reunioes?
		if (tamanho >= corridas.length) {
			duplicaCorridas();
		}
		this.corridas[tamanho] = c;
		tamanho++;
	}

	public void solicitarCorrida(Data dataPedido, String cliente, String inicio, String destino, double km) {
		this.solicitarCorrida(new Corrida(dataPedido, cliente, inicio, destino, km));
	}

	public void duplicaCorridas() {
		Corrida[] corridasAux = new Corrida[2 * tamanho];
		// for indexado
		for (int i = 0; i < tamanho; i++) {
			corridasAux[i] = this.corridas[i];
		}
		this.corridas = corridasAux;
	}
	
	public int getQuantidadeCorridas() {
		return tamanho;
	}
	
	public List<Corrida> getCorridasCliente(String cliente){
		List<Corrida> corridasLista = new ArrayList<Corrida>();
		for(Corrida c : corridas) {
			if(c.getCliente().equals(cliente)) {
				corridasLista.add(c);
			}
		}
		return corridasLista;
	}
	
	public double getCustoCorridas(String cliente) {
		double custoAgregado = 0;
		for(Corrida c : corridas) {
			if(c.getCliente().equals(cliente)) {
				custoAgregado += c.getCustoCorrida();
			}				
		}
		return custoAgregado;
	}
	
//	public Corrida removeCorridaMaisAntiga(String cliente) {
//		
//	}
	
	private int getIndiceCorridaMaisAntiga(String cliente) {
		int indiceCorridaMaisAntiga = -1;
		for(int i = 0; i < tamanho; i++) {
			if(corridas[i].getCliente().equals(cliente)) {
				if(i==-1) {
					indiceCorridaMaisAntiga = i;
				}
				else {
					if(corridaAehMaisAntigaDoQueCorridaB(corridas[i], corridas[indiceCorridaMaisAntiga])) {
						indiceCorridaMaisAntiga = i;
					}
				}
			}
		}
		return indiceCorridaMaisAntiga;
	}
	
	private boolean corridaAehMaisAntigaDoQueCorridaB(Corrida a, Corrida b) {
		if(a.getDataCorrida().getAno()<b.getDataCorrida().getAno()) {
			return true;
		} else if(a.getDataCorrida().getAno() > b.getDataCorrida().getAno()) {
			return false;
		} else {	//anos iguais
			if(a.getDataCorrida().getMes()< b.getDataCorrida().getMes()) {
				return true;
			} else if(a.getDataCorrida().getMes() > b.getDataCorrida().getMes()) {
				return false;
			}
			else {	//meses iguais
				if(a.getDataCorrida().getDia()< b.getDataCorrida().getDia()) {
					return true;
				} else if(a.getDataCorrida().getDia() > b.getDataCorrida().getDia()) {
					return false;
				}
				else {	//dias iguais
					return false;
				}
			}
		}
	}
	
	



}
