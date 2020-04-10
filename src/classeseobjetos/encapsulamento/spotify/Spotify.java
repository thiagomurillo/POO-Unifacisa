package classeseobjetos.encapsulamento.spotify;

import java.util.ArrayList;
import java.util.List;

import classeseobjetos.encapsulamento.spotify.Musica.Genero;

public class Spotify {

	private Musica[] musicas;
	private int tamanho;

	// sobrecarga de construtores
	public Spotify() {
		this(10);
	}

	public Spotify(int tamanho) {
		this.musicas = new Musica[tamanho];
		this.tamanho = 0;
	}

	public void add(Musica m) {
		if (tamanho >= musicas.length) {
			duplicaArray();
		}
		musicas[tamanho] = m;
		tamanho++;
	}

	private void duplicaArray() {
		// implementado
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean remover(Musica m) {
		for (int i = 0; i < tamanho; i++) {
			if (musicas[i].equals(m)) {

				// remover (a lua me traiu)
				// [californication, menino ou menina, milu, -(milu)]
				// tamanho--
				for (int j = i; j < tamanho - 1; j++) {
					musicas[j] = musicas[j + 1];
				}
				tamanho--;
				return true;
			}
		}
		return false;
	}

	public List<Musica> listaPorArtista(String artista) {
		List<Musica> musicasDoArtista = new ArrayList<Musica>();
		for (Musica m : musicas) {
			if (m.getArtista().equals(artista)) {
				musicasDoArtista.add(m);
			}
		}
		return musicasDoArtista;
	}

	public List<Musica> listaPorAno(short ano) {
		List<Musica> musicasDoAno = new ArrayList<Musica>();
		for (Musica m : musicas) {
			if (m.getAno() == ano) {
				musicasDoAno.add(m);
			}
		}
		return musicasDoAno;
	}

	public List<Musica> listaPorGenero(Genero g) {
		List<Musica> musicasDoGenero = new ArrayList<Musica>();
		for (Musica m : musicas) {
			if (m.getGenero().equals(g)) {
				musicasDoGenero.add(m);
			}
		}
		return musicasDoGenero;
	}

	public Musica getMusicaMaiorDuracao() {
		// musicaMaiorDuracao ==> 8
		// m
		// \/
		// [3.5, 2, 5, 5, 3.2, 6, 2.4, 5.9, 8]
		Musica musicaMaiorDuracao = null;
		for (Musica m : musicas) {
			if (musicaMaiorDuracao == null)
				musicaMaiorDuracao = m;
			else if (m.getDuracao() > musicaMaiorDuracao.getDuracao()) {
				musicaMaiorDuracao = m;
			}
		}
		return musicaMaiorDuracao;
	}

	// reproduzir eh uma funcao sobrecarregada
	public void reproduzir(String nome) {
		for (Musica m : musicas) {
			if (m.getNome().equals(nome)) {
				m.reproduzir();
			}
		}
	}

	// reproduzir eh uma funcao sobrecarregada
	public void reproduzir(Musica mus) {
		for (Musica m : musicas) {
			if (m.equals(mus)) {
				m.reproduzir();
			}
		}
	}

	// reproduzir eh uma funcao sobrecarregada
	public int getNumReproducoes(Musica mus) {
		for (Musica m : musicas) {
			if (m.equals(mus)) {
				return m.getNumeroDeReproducao();
			}
		}
		return -1;
	}

}
