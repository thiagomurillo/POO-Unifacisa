package classeseobjetos.construtores;

public class LojaDeCarros {
	
	public static void main(String[] args) {
		
		Carro palio1 = new Carro("Pálio", "Fiat", 35000);
		Carro palioPrata = new Carro("Pálio", "Fiat", "PRATA",
				2, false, false, false, false, 35000);
		Carro civic = new Carro("Civic", "Honda", "BRANCO", 
				4, true, true, true, true, 110000);
		
		System.out.println(palio1);
		System.out.println(palioPrata);
		System.out.println(civic);
		
		Carro gol = new Carro();
		gol.vidroEletrico = true;
		gol.arCondicionado = true;
		gol.cambioAutomatico = true;
		
	}

}
