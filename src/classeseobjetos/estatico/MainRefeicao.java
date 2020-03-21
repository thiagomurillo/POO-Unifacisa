package classeseobjetos.estatico;

class MainRefeicao {
	public static void main(String[] args) {
		
		System.out.println("Preço base: "+ Refeicao.precoBase);
		System.out.println(Refeicao.exibirCardapio());
		
		Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 2);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 0);

		System.out.println(almoco);
		System.out.println(jantar);
		
		//o dono decidiu mudar o preço base de todas as refeições para 10
		Refeicao.precoBase = 12;
		
		System.out.println(almoco);
		System.out.println(jantar);
	}
}
