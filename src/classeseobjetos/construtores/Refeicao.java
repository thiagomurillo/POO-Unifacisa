package classeseobjetos.construtores;

class Refeicao {
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento;
	double preco;
	
	public Refeicao() {}

	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina,
			int tempoCozimento, double preco) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
	}

	public Refeicao(String carboidrato, String proteina) {
		this.carboidrato = carboidrato;
		this.proteina = proteina;
		this.nome = carboidrato + " com " + proteina;
	}
}
