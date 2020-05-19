package polimorfismo.mortalkombat;

public class Jax extends Lutador{
	
	public Jax() {
		super("Jax");
	}
	
	@Override
	public void socar(Lutador oponente) {
		super.socar(oponente);	//tirando 7 de life
		oponente.vida -= 10;	//tirando mais 10 de life		
	}

}
