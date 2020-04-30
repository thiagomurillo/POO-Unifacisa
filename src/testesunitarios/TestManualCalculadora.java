package testesunitarios;

public class TestManualCalculadora {
	
public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		if((c.maior(3, 35) == 35) &&
		   (c.maior(-1, 1) == 1) &&
		   (c.maior(10, 10) == 10)) {
			System.out.println("Função maior está funcionando");
		}
		
		
		if((c.soma(2) == 2) &&
		   (c.soma(2,4,6,8) == 20) &&
		   (c.soma(0,0,0,0,0,0,18,22) == 40) ) {
			System.out.println("Função soma está funcionando");
		}
		
		//quando formos pensar nos casos de teste
		//é importante que pensemos nos "corner cases"
		//
		//caso1: negativo, negativo (-1,-2); (-5, -9)
		//caso2: negativo muito grande, negativo muito grande
		//caso2: negativo, positivo
		//caso3: positivo, negativo
		//caso4: positivo, positivo
		//caso5: zero, positivo
		//caso6: zero, negativo
		//caso7: positivo, zero
		//caso8: negativo, zero
		if((c.subtrai(-10, -10) == 0) &&
		   (c.subtrai(2, -3) == 5) &&
		   (c.subtrai(0, -15) == 15)) {
			System.out.println("Função subtrai está funcionando");
		}
		
		//caso1: numero cujo resultado é inteiro (sem casa decimal)
		//caso2: numero negativo
		//caso3: zero
		//caso4: numero cujo resultado não é inteiro (possui casa decimal)
		if((c.raizQuadrada(4) == 2) &&
		   (c.raizQuadrada(1000000) == 1000) &&
		   (c.raizQuadrada(-4) == 0) &&
		   (c.raizQuadrada(0) == 0)) {
			System.out.println("Função raiz está funcionando");
		}
		
	}

}
