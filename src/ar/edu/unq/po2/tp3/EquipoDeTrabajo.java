package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private List<Persona> trabajadores = new ArrayList<Persona>();
	private String nombre;
	
	public EquipoDeTrabajo(String nombre) {
		this.setNombre(nombre);
	}
	public String getNombre() {
		return this.nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EquipoDeTrabajo agregarAlEquipo(Persona persona) {
		trabajadores.add(persona);
		return this;
	}
	public int sumatoriaDeEdades() {
		int sumatoria = 0;
		for(Persona persona:trabajadores) {
			sumatoria+= persona.edad();
		}
		return sumatoria;
	}
	public float promedioDeEdad() {
		return this.sumatoriaDeEdades() / this.trabajadores.size();
	}
}
