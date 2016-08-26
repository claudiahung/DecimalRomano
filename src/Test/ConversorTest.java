package Test;

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
	


}
