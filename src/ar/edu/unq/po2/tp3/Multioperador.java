package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	private List<Integer> getNumeros() {
		return numeros;
	}
	public int suma() {
		int sumatoria = 0;
		for (Integer numero : this.getNumeros()) {
			sumatoria += numero;
		}
		return sumatoria;
	}
	public int resta() {
		int resta = 0;
		for (Integer numero : this.getNumeros()) {
			resta -= numero;
		}
		return resta;
	}
	public int multipicacion() {
		int multiplicacion = 1;
		for (Integer numero : this.getNumeros()) {
			multiplicacion = multiplicacion * numero;
		}
		return multiplicacion;
	}
	public Multioperador addNumber(int i) {
		this.getNumeros().add(i);
		return this;
	}
}
