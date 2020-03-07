package classeseobjetos.retangulo;

public class MainRetangulo {
	
	public static void main(String[] args) {
		
		Retangulo ret1 = new Retangulo(10,20);
		
		System.out.println("Area: "+ret1.getArea());
		System.out.println("Perimetro: "+ret1.getPerimetro());
		
		Retangulo ret2 = new Retangulo(10,20);
		
		/**
		 * Embora tenham o mesmo conteúdo, estão 
		 * em diferentes endereços de memória.
		 */
		System.out.println("ret1 == ret2? "+(ret1==ret2));
		
		
		
	}

}
