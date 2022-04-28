package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	
	EquipoDeTrabajo equipo1, equipo2;
	Persona p1, p2, p3, p4, p5, p6, p7, p8;
	LocalDate date1, date2, date3, date4, date5, date6, date7, date8;
	
	@BeforeEach
	void setUp() {
		date1 = LocalDate.of(1998, 5, 20);
		date2 = LocalDate.of(2002, 8, 2);
		date3 = LocalDate.of(1968, 3, 22);
		date4 = LocalDate.of(1972, 4, 10);
		date5 = LocalDate.of(1988, 5, 28);
		date6 = LocalDate.of(1990, 3, 2);
		date7 = LocalDate.of(1991, 1, 4);
		date8 = LocalDate.of(1998, 12, 5);
		p1 = new Persona("Pepe", date1); //23
		p2 = new Persona("Juan", date2);  //19
		p3 = new Persona("Luana", date3);//54
		p4 = new Persona("Gero", date4); //50
		p5 = new Persona("Gus", date5);  //33 //35.8
		p6 = new Persona("Ana", date6);   //32
		p7 = new Persona("Miguel", date7);//31
		p8 = new Persona("Jose", date8); //23 //28.6667
		
		equipo1 = new EquipoDeTrabajo("Desarrollo");
		equipo2 = new EquipoDeTrabajo("Testing");
		equipo1.agregarAlEquipo(p1);
		equipo1.agregarAlEquipo(p2);
		equipo1.agregarAlEquipo(p3);
		equipo1.agregarAlEquipo(p4);
		equipo1.agregarAlEquipo(p5);
		equipo2.agregarAlEquipo(p6);
		equipo2.agregarAlEquipo(p7);
		equipo2.agregarAlEquipo(p8);
	}
	
	@Test
	public void testEquipo() {
		assertEquals(equipo1.getNombre(), "Desarrollo");
		assertEquals(equipo2.getNombre(), "Testing");
		assertEquals(equipo1.promedioDeEdad(), 35);
		assertEquals(equipo2.promedioDeEdad(), 28);
	}

}
