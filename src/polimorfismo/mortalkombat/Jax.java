package polimorfismo.mortalkombat;

public class Jax extends Lutador{
	
	public Jax() {
		super("Jax");
	}
	
	@Override
	public int socar() {
		return super.socar() + 10;			
	}

}
