package kataCalculadoraJava;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestsBasicos {
	
	private Calculadora calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero() {

		Assert.assertEquals(0, calc.Valor());
	}
	
	@Test
	public void Sumar_2_mas_3_debe_dar_5() {
		
		calc.Sumar(2, 3);
		Assert.assertEquals(5, calc.Valor());
	}
	
	@Test
	public void Sumar_4_mas_3_debe_dar_7() {
		
		calc.Sumar(4, 3);
		Assert.assertEquals(7, calc.Valor());
	}
	

}
