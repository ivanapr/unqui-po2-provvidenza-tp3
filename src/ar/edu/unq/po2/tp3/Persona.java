package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {
	public String nombre;
	public LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.setNombre(nombre);
		this.setFechaDeNacimiento(fechaDeNacimiento);
	}
	public int edad() {
		return LocalDate.now().getYear() - this.getFechaDeNacimiento().getYear() + this.yaCumplio();
	}
	public int yaCumplio() {
		if(LocalDate.now().getDayOfYear() >= this.getFechaDeNacimiento().getDayOfYear())
			return 0;
		else return -1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public boolean menorQue(Persona persona) {
		return this.edad() > persona.edad();
	}
}
