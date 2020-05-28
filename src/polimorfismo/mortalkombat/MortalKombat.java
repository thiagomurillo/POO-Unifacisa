package polimorfismo.mortalkombat;

public class MortalKombat {
	
	private Lutador l1, l2;
	
	public MortalKombat(Lutador l1, Lutador l2) {
		this.l1 = l1;
		this.l2 = l2;
		fight();
	}
	
	public void fight() {
		while(l1.getVida() > 0 || l2.getVida() > 0) {
			//sorteia lutador
			//sorteia golpe
			//realiza golpe; polimorfismo acontece aqui
			
			l1.socar();
			
			//pomeos colocar prints adicionais aqui
		}
	}
	
	public static void main(String[] args) {
		//instanciar MK, passando os 2 lutadores
		//automaticamente a luta comeca, pois fight eh chamado dentro do construtor
	}

}
