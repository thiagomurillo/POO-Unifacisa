package provas.googlekeep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestGoogleKeep {
	
	GoogleKeep keep;
	
	@Before
	public void setup() {
		keep = new GoogleKeep();
	}

	@Test
	public void testConstrutor() {
		assertNotNull(keep.notas);
		assertEquals(10,keep.notas.length);
		assertEquals(0,keep.getTamanho());
	}

	@Test
	public void testAdicionarNotaStringStringData() {
		//vamos adicionar notas e verificar tamanho
		assertEquals(0, keep.getTamanho());
		
		for(int i = 1; i <= 20; i++) {		
			keep.adicionarNota("Aula sobre testes unitarios", "Eduardo", 
					new Data((short)6, (short)5, (short)2020));		
			assertEquals(i, keep.getTamanho());
		}		
	}

	@Test
	public void testAdicionarNotaNota() {
		assertEquals(0, keep.getTamanho());
		
		for(int i = 1; i <= 20; i++) {		
			Nota n1 = new Nota("Aula sobre testes unitarios", "Eduardo", 
					new Data((short)6, (short)5, (short)2020));
			keep.adicionarNota(n1);
			assertEquals(i, keep.getTamanho());
		}
	}
	
	@Test
	public void testDuplicaArray() {
		assertEquals(0, keep.getTamanho());
		
		for(int i = 1; i <= 10; i++) {		
			Nota n1 = new Nota("Aula sobre testes unitarios", "Eduardo", 
					new Data((short)6, (short)5, (short)2020));
			keep.adicionarNota(n1);
			assertEquals(i, keep.getTamanho());
		}
		
		keep.duplicaArray();		
		assertEquals(20, keep.getNotasArrayLength());
	}

	@Test
	public void testGetNotasAutor() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNotasComPalavra() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveNotaMaisAntiga() {
		fail("Not yet implemented");
	}

}
