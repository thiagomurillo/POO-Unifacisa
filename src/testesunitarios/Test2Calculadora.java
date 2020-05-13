package testesunitarios;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test2Calculadora {

	private Calculadora calc;
	private int a, b, c;

	@Before
	public void setUp() {
		calc = new Calculadora();
		a = 5;
		b = 10;
		c = 100;
		System.out.println("Set up!!");
	}

	@Test
	public void testMaior() {
		// case1: positivo, positivo
		Assert.assertEquals(10, calc.maior(1, 10));

		// case2: positivo, negativo
		Assert.assertEquals(1, calc.maior(1, -10));

		// case3: negativo, positivo
		Assert.assertEquals(10, calc.maior(-1, 10));

		// case4: negativo, negativo
		Assert.assertEquals(-1, calc.maior(-1, -10));

		// case5: iguais positivos
		Assert.assertEquals(10, calc.maior(10, 10));

		// case6: iguais negativos
		Assert.assertEquals(-10, calc.maior(-10, -10));

		// case7: iguais 0
		Assert.assertEquals(0, calc.maior(0, 0));
	}

	@Test
	public void testRaizQuadrada() {

		// caso1: numero cujo resultado é inteiro (sem casa decimal)
		Assert.assertEquals(b, calc.raizQuadrada(c), 0);

		// caso2: numero negativo
		// caso3: zero
		// caso4: numero cujo resultado não é inteiro (possui casa decimal)
	}

	@Test
	public void testDouble() {
		double num = 0;
		num += 5.6;
		num += 5.8;

		System.out.println(num);

		Assert.assertEquals(11.4, num, 0.0000001);
	}

	@Test(expected=FileNotFoundException.class)
	public void testException() throws FileNotFoundException{
		throw new FileNotFoundException();		
	}

}
