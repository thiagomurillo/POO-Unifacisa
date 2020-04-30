package testesunitarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadora {

	Calculadora c = new Calculadora();
	
	@Test
	public void testMaior() {
		//case1: positivo, positivo
		Assert.assertEquals(10,c.maior(1, 10));
		
		//case2: positivo, negativo
		Assert.assertEquals(1,c.maior(1, -10));
		
		//case3: negativo, positivo
		Assert.assertEquals(10,c.maior(-1, 10));
		
		//case4: negativo, negativo
		Assert.assertEquals(-1,c.maior(-1, -10));
		
		//case5: iguais positivos
		Assert.assertEquals(10,c.maior(10, 10));
		
		//case6: iguais negativos
		Assert.assertEquals(-10,c.maior(-10, -10));
		
		//case7: iguais 0
		Assert.assertEquals(0,c.maior(0, 0));
	}
	
	@Test
	public void testDouble() {
		double num = 0;
		num += 5.6;
		num += 5.8;
		
		System.out.println(num);
		
		Assert.assertEquals(11.4,num,0);
	}
	
//	@Test
//	public void testRaizQuadrada() {
//		
//		//caso1: numero cujo resultado é inteiro (sem casa decimal)
//		Assert.assertEquals(2,c.raizQuadrada(4),0.00000001);
//				
//		//caso2: numero negativo
//		//caso3: zero
//		//caso4: numero cujo resultado não é inteiro (possui casa decimal)
//	}

}
