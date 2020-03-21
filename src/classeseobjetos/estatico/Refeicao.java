package classeseobjetos.estatico;

class Refeicao {
	// variáveis estáticas
	static double precoBase = 10;

	// variáveis de instância
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento;
	double precoAdicional;

	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina,
			int tempoCozimento, double precoAdicional) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.precoAdicional = precoAdicional;
	}

	@Override
	public String toString() {
		String output = "";
		output += "Nome: " + this.nome + "\n";
		output += "Carboidrato: " + this.carboidrato + "\n";
		output += "Gramas carboidrato: " + this.gramasCarboidrato + "\n";
		output += "Proteina: " + this.proteina + "\n";
		output += "Gramas proteina: " + this.gramasProteina + "\n";
		output += "Tempo de cozimento: " + this.tempoCozimento + "\n";
		output += "Preço base: " + Refeicao.precoBase + "\n";
		output += "Preço Adicional: " + this.precoAdicional + "\n";
		return output;
	}
	
	//função estática
	public static String exibirCardapio(){
		String cardapio = "Carboidratos: \n";
		cardapio += "Inhame - R$5\n";
		cardapio += "Batata doce - R$5\n";
		cardapio += "Feijão - R$7\n";
		cardapio += "Cuscuz - R$4\n";
		cardapio += "\n";
		cardapio += "Proteínas:\n";
		cardapio += "Ovo - R$2\n";
		cardapio += "Bife - R$6\n";
		cardapio += "Maminha - R$7\n";
		cardapio += "Picanha - R$15\n";
		cardapio += "\n";
		cardapio += "Bebidas:\n";
		cardapio += "Refrigerante lata - R$5\n";
		cardapio += "Refrigerante 1l - R$9\n";
		cardapio += "Refrigerante 2l - R$15\n";
		cardapio += "Suco - R$5\n";
		cardapio += "Café - R$2\n";
		cardapio += "Picanha - R$15\n";
		return cardapio;
	}
}
