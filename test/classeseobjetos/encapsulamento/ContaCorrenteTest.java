package classeseobjetos.encapsulamento;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classeseobjetos.encapsulamento.exceptions.ValorInvalidoException;

public class ContaCorrenteTest {
	
	private static final double DOUBLE_TOLERANCE = 0.000000001;

	private ContaCorrente conta;
	
	@Before
	public void setup() {
		//saldo zerado
		conta = new ContaCorrente(1000, 123456, "Eduardo");
	}
	
	@Test
	public void testDepositarQuantiaPositiva() throws ValorInvalidoException {
		conta.depositar(1000);
		Assert.assertEquals(1000, conta.getSaldo(), ContaCorrenteTest.DOUBLE_TOLERANCE);
		//intervalo [999.9999999999, 1000.000000001]
		//1000.000000000001
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testDepositarQuantiaNegativa() throws ValorInvalidoException{
		conta.depositar(-1000);
	}
	
	@Test
	public void testVerificaRetirada() {
		
		Assert.assertTrue(conta.verificaRetirada(700));
		Assert.assertFalse(conta.verificaRetirada(1001));
		
	}

}
