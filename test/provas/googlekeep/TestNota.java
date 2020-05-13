package provas.googlekeep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestNota {
	
	private Data d;
	private Nota n;
	
	@Before
	public void setup() {
		d = new Data((short)4,(short)5,(short)2020);
		n = new Nota("prova unidade I", "Eduardo", d);
	}

	@Test
	public void testNota() {
		
		assertNotNull(n);
		assertEquals("prova unidade I", n.getConteudo());
		assertEquals("Eduardo", n.getAutor());
		
		Data dataAux = new Data((short)4,(short)5,(short)2020);
		//como Data não tem uma função sobrescrita de equals
		//Data usa o equals herdado de Object
		//o equals de Object compara com ==
		assertEquals(dataAux, n.getCriacao());	
	}

	@Test
	public void testToString() {
		//Conteudo: prova unidade I
		//Autor: Eduardo
		//Data: 4/5/2020
		String output = "";
		output += "Conteudo: prova unidade I\n";
		output += "Autor: Eduardo\n";
		output += "Data: 4/5/2020";
		
		//do lado esquerdo fica o valor esperado
		//do lado direito fica a chamada de função a ser testadas
		assertEquals(output, n.toString());
		
		n.setConteudo("prova unidade II");
		n.setAutor("Mariana");
		
		output = "";
		output += "Conteudo: prova unidade II\n";
		output += "Autor: Mariana\n";
		output += "Data: 4/5/2020";
		
		//do lado esquerdo fica o valor esperado
		//do lado direito fica a chamada de função a ser testadas
		assertEquals(output, n.toString());
	}
	
	

}
