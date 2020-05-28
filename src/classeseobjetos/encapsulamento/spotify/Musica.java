package classeseobjetos.encapsulamento.spotify;

public class Musica {
	
	public enum Genero {
		SAMBA(5.2), PAGODE(8.0), FOLK(9.0), ROCK(3.0), FORRO(3.0), MPB(8.3), OUTROS(3.0);
		private double value;
		
		private Genero(double value) {
			this.value = value;
		}
		 
	}
		
	private String nome, artista;
	private Genero genero;
	private short ano, duracao;
	private int numeroDeReproducao;
	
	private double custo;
	
	public Musica(String nome, String artista, Genero genero, short ano, short duracao) {
		this.nome = nome;
		this.artista = artista;
		this.genero = genero;
		this.ano = ano;
		this.duracao = duracao;
		this.numeroDeReproducao = 0;
		definirCusto();
	}
	
	private void definirCusto() {
		switch(this.genero) {
			case SAMBA:
			case FOLK:
			case FORRO:
				this.custo = 0.5;
				break;
			case ROCK:
				this.custo = 0.7;
				break;
			default:
				this.custo = 0.1;
		}
	}
	
	public void reproduzir() {
		this.numeroDeReproducao++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public short getAno() {
		return ano;
	}
	
	public short getDuracao() {
		return duracao;
	}
	
	public int getNumeroDeReproducao() {
		return numeroDeReproducao;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		else {
			if(obj instanceof Musica) {
				Musica m = (Musica) obj;
				if(this.nome.equals(m.getNome()) &&
				   this.artista.equals(m.getArtista()) &&
				   this.genero.equals(m.getGenero()) &&
				   this.ano == m.getAno() &&
				   this.duracao == m.getDuracao()) {
					return true;
				}				
			}
		}
		return false;
	}
	
}
