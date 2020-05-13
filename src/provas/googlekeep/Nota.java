package provas.googlekeep;

public class Nota {
	
	private String conteudo, autor;
	private Data criacao;
	
	public Nota(String conteudo, String autor, Data criacao) {
		this.conteudo = conteudo;
		this.autor = autor;
		this.criacao = criacao;
	}

	public String toString() {
		String output = "";
		output += "Conteudo: "+ conteudo +"\n";
		output += "Autor: "+ autor +"\n";
		output += "Data: "+ criacao.toString();
		return output;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Data getCriacao() {
		return criacao;
	}

	public void setCriacao(Data criacao) {
		this.criacao = criacao;
	}
	
		

}
