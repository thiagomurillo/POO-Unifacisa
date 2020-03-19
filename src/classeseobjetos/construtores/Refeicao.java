package classeseobjetos.construtores;

class Refeicao {

	// variáveis de instância (objeto)
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento;
	double preco;
	

	// construtor default
	public Refeicao() {
	}

	// construtor com argumentos
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

	// contrutor com 2 strings como argumento
	public Refeicao(String carboidrato, String proteina) {
		this(carboidrato + " com " + proteina, carboidrato, 100, proteina, 100, 10, 10);
	}

	// função para retornar os valores dos atributos em forma de string
	@Override
	public String toString() {
		String output = "";
		output += "Nome: " + this.nome + "\n";
		output += "Carboidrato: " + this.carboidrato + "\n";
		output += "Gramas carboidrato: " + this.gramasCarboidrato + "\n";
		output += "Proteina: " + this.proteina + "\n";
		output += "Gramas proteina: " + this.gramasProteina + "\n";
		output += "Tempo de cozimento: " + this.tempoCozimento + "\n";
		output += "Preço: " + this.preco + "\n";
		return output;
	}
}
