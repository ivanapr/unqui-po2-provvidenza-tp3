package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {

	Point p1, p2;
	
	@BeforeEach
	public void setUp() {
		p1 = new Point();
		p2 = new Point(2,2);
	}
	
	@Test
	public void testConstructores() {
		assertEquals(0, p1.getX());
		assertEquals(0, p1.getY());
		assertEquals(2, p2.getX());
		assertEquals(2, p2.getY());
	}
	
	@Test
	public void testRelocarYSumar() {
		p1.moverPunto(5, 3);
		assertEquals(5, p1.getX());
		assertEquals(3, p1.getY());
		p2 = p1.sumarPuntos(p2, p1);
		assertEquals(7, p2.getX());
		assertEquals(5, p2.getY());
	}
}
