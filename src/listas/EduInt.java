package listas;

public class EduInt{
	
	private int valor;

	
	public EduInt(int valor) {
		super();
		this.valor = valor;		
	}
	
	@Override
	public String toString() {
		return ""+this.valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		EduInt v = null;
		if(obj instanceof EduInt) {
			v = (EduInt) obj;
			return valor == v.valor;
		}
		return false;
	}
	
	

}
