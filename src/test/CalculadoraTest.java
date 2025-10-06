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

import pkg.Calculadora;

/**
 * 
 */
class CalculadoraTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}	

	@Test
	void testResta() {
		assertEquals(5, Calculadora.resta(8,3));
	}	

	@Test
	void testMultiplica() {
		assertEquals(6, Calculadora.multiplica(2,3));
	}	

	@Test
	void testDivide() {
		assertEquals(2, Calculadora.divide(6,3));
	}	

}
