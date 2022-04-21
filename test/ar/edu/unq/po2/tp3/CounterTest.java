package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	//Verifica la cantidad de impares
	@Test
	public void testCantidadDeImpares() {
		assertEquals(counter.cantidadDeImpares(), 9);
	}
	
	//Verifica la cantidad de pares
	@Test
	public void testCantidadDePares() {
		assertEquals(counter.cantidadDePares(), 1);
	}
	
	//Verifica la cantidad de multiplos de cierto numero
	@Test
	public void testCantidadDeMultiplos() {
		assertEquals(counter.cantidadDeMultiplos(3), 2);
	}
	
	@Test
	public void cantidadDePares() {
		assertEquals(counter.cantDigitosPares(422),3);
	}

}
