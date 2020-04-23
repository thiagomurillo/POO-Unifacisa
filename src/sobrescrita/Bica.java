package sobrescrita;

public class Bica extends Zoologico{
	
	@Override
	public Bulldog getMascote() {
		return new Bulldog();
	}

}
