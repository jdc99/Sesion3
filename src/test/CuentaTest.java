/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

/**
 * 
 */
class CuentaTest {

	private static Cuenta cuenta, cuenta12345, cuenta67890;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(null, null, 0);
		cuenta12345 = new Cuenta("12345", null, 50);
		cuenta67890 = new Cuenta("67890", null, 0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cuenta.setSaldo(0.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		cuenta.ingresar(500);
		assertEquals(500, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500);
		assertEquals(-500, cuenta.getSaldo());
	}

	@Test
	void test0014() {
		cuenta12345.retirar(200);
		cuenta67890.retirar(350);
		cuenta12345.ingresar(100);
		cuenta67890.retirar(200);
		cuenta67890.retirar(150);
		cuenta12345.retirar(200);
		cuenta67890.ingresar(50);
		cuenta67890.retirar(100);
		
		assertEquals(-250, cuenta12345.getSaldo());
		assertEquals(-450, cuenta67890.getSaldo());
	}
}
