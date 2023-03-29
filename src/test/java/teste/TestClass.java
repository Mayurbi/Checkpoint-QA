package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class TestClass {

	Triangulo tri = new Triangulo();
	@Test
	public void teste1() {
		int valor1 = 3;
		int valor2 = 2;
		int valor3 = 1;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("Escaleno", resultado);
	}
	
	@Test
	public void teste2() {
		int valor1 = 2;
		int valor2 = 2;
		int valor3 = 1;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("Isoceles", resultado);
	}
	
	@Test
	public void teste3() {
		int valor1 = 2;
		int valor2 = 2;
		int valor3 = 2;
		String resultado = tri.test(valor1,valor2, valor3);
		assertEquals("Equilatero", resultado);
	}

}
