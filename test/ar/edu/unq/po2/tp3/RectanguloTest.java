package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	Rectangulo r1,r2,r3;
	Cuadrado c;
	Point p;
	
	@BeforeEach
	public void setUp() {
		p = new Point();
		r1 = new Rectangulo(p,2,3);
		r2 = new Rectangulo(p,5,3);
		p.moverPunto(2, -1);
		r3 = new Rectangulo(p,1,3);
		c = new Cuadrado(p,2);
	}
	
	@Test
	public void testAreaYPerimetro() {
		assertEquals(r1.getPerimetro(), 10);
		assertEquals(r2.getPerimetro(), 16);
		assertEquals(r3.getPerimetro(), 8);
		assertEquals(r1.getArea(), 6);
		assertEquals(r2.getArea(), 15);
		assertEquals(r3.getArea(), 3);
		assertEquals(c.getArea(), 4);
		assertEquals(c.getPerimetro(), 8);
	}
	
	@Test
	public void testHorizontalVertical() {
		assertEquals(true, r1.esVertical());
		assertEquals(false, r2.esVertical());
		assertEquals(true, r3.esVertical());
		assertEquals(false, r1.esHorizontal());
		assertEquals(true,r2.esHorizontal());
		assertEquals(false, r3.esHorizontal());
		assertEquals(false, c.esHorizontal());
		assertEquals(false, c.esVertical());
	}

}
