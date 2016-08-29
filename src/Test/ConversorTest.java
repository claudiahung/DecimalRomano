package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Conversor.Conversor;

public class ConversorTest {
	
	private Conversor c;
	
	@Before
	public void setUp() {
		c= new Conversor();
		System.out.println("Inicia");

	}
	
	@Test
	public void ConverteNumeroUm()
	{
		int result = c.conversao("I");

		Assert.assertEquals(1, result);
	}
	
	@Test
	public void converterOSimboloV() {

		

		int resultadoObtido = c.conversao("V");

		assertEquals(5, resultadoObtido);
	}

	@Test
	public void converterOSimboloC() {


		int resultadoObtido = c.conversao("C");

		assertEquals(100, resultadoObtido);
	}

	@Test
	public void converterOSimboloII() {
		
		int resultadoObtido = c.conversao("II");

		assertEquals(2, resultadoObtido);
	}

	@Test
	public void converterOSimboloIV() {
	
		int resultadoObtido = c.conversao("IV");

		assertEquals(4, resultadoObtido);
	}

	@Test
	public void converterOSimboloIX() {
	
		int resultadoObtido = c.conversao("IX");

		assertEquals(9, resultadoObtido);
	}

	@Test
	public void converterOSimboloXXIV() {
		
		int resultadoObtido = c.conversao("XXIV");

		assertEquals(24, resultadoObtido);
	}
	
	@After
	public void Finaliza() {
		System.out.println("Finaliza");
		
		}

	


}
