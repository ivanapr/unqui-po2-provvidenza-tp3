package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	
	Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();
		
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		multioperador.addNumber(7);
	}
	
	@Test
	public void testSuma() {
		assertEquals(multioperador.suma(),16);
	}
	@Test
	public void testResta() {
		assertEquals(multioperador.resta(),-16);
	}
	@Test
	public void testMult() {
		assertEquals(multioperador.multipicacion(),105);
	}
}
