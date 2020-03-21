package classeseobjetos.construtores;

public class Carro {
	
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado;
	boolean cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	public Carro(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = "BRANCO";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	public Carro(String nome, String marca, String cor,
			int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica,
			double precoBase) {
		this(nome, marca, precoBase);
		this.portas = portas;
		this.cor = cor;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;		
	}
	
	public Carro() {}
	
	public double calculaPreco() {
		double precoTotal = precoBase;
		
		switch (cor) {
		case "BRANCO":
			precoTotal += 200;
			break;
		case "AZUL":
			precoTotal += 250;
			break;
		case "VERMELHO":	
			precoTotal += 400;
			break;
		case "PRETO":
			precoTotal += 500;
			break;
		default:
			precoTotal += 1000;
			break;
		}
		
		if(vidroEletrico)
			precoTotal += 1250;
		
		if(arCondicionado)
			precoTotal += 1250;
		
		if(cambioAutomatico)
			precoTotal += 1250;
		
		if(direcaoEletrica) 
			precoTotal += 1250;
		
		return precoTotal;
	}
	
	@Override
	public String toString() {
		String saida = "Nome: "+this.nome+"\n";
		saida += "Marca: "+this.marca+"\n";
		saida += "Cor: "+this.cor+"\n";
		saida += "Portas: "+this.portas+"\n";
		//operador ternário
		saida += "Vidro elétrico: "+(this.vidroEletrico == true ? "sim" : "não") +"\n";
		saida += "Ar condicionado: "+(this.arCondicionado == true ? "sim" : "não")+"\n";
		saida += "Câmbio automático: "+(this.cambioAutomatico == true ? "sim" : "não")+"\n";
		saida += "Direcao Eletrica: "+(this.cambioAutomatico == true ? "sim" : "não")+"\n";
		saida += "Preco base: "+this.precoBase+"\n";
		saida += "Preco total: "+this.calculaPreco()+"\n";
		return saida;
	}
	

}
