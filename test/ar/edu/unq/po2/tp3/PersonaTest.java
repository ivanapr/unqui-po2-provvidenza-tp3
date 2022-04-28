package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	// Debe calcularse la edad porque es variable con el tiempo
	Persona p1, p2;
	LocalDate date = LocalDate.of(1996, 8, 26);
	
	@BeforeEach
	public void setUp() {
		p1 = new Persona("Ivana", date);
		date = LocalDate.of(1996, 2, 5);
		p2 = new Persona("Eva", date);
	}
	
	@Test
	public void testConstructorP1() {
		assertEquals(p1.edad(), 25);
		assertEquals(p1.getNombre(), "Ivana");
	}
	@Test
	public void testConstructorP2() {
		assertEquals(p2.edad(), 26);
		assertEquals(p2.getNombre(), "Eva");
	}
	@Test
	public void testMenorQue() {
		assertEquals(false, p1.menorQue(p2));
		assertEquals(true, p2.menorQue(p1));
		assertEquals(false, p1.menorQue(p1));
	}
}
