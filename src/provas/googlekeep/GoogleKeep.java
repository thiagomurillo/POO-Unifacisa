package provas.googlekeep;

import java.util.List;

public class GoogleKeep {
	
	protected Nota [] notas;
	protected int tamanho;
	
	public GoogleKeep() {
		notas = new Nota[10];
		tamanho = 0;
	}
	
	public void adicionarNota(String conteudo, String autor, Data criacao) {
		if(tamanho >= notas.length) {
			duplicaArray();
		}
		Nota n = new Nota(conteudo, autor, criacao);
		notas[tamanho] = n;
		tamanho++;
	}
	
	protected void duplicaArray() {
		Nota[] notasTemp = new Nota[2*tamanho];
		for(int i = 0; i < tamanho; i++) {
			notasTemp[i] = notas[i];
		}
		notas = notasTemp;		
	}
	
	protected int getNotasArrayLength() {
		return notas.length;
	}
	
	public void adicionarNota(Nota n) {
		adicionarNota(n.getConteudo(), n.getAutor(), n.getCriacao());
	}
	
	public List<Nota> getNotasAutor(String autor){
		//TODO
		return null;
	}
	
	public List<Nota> getNotasComPalavra(String palavra){
		//TODO
		return null;
	}
	
	public Nota removeNotaMaisAntiga(String autor) {
		//TODO
		return null;
	}
	
	public int getTamanho() {
		return tamanho;
	}


}
