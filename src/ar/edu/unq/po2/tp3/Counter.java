package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	private List<Integer> getNumeros() {
		return numeros;
	}
	
	public int cantidadDePares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) cantidad++;
		}
		return cantidad;
	}
	
	public int cantidadDeImpares() {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 1) cantidad++;
		}
		return cantidad;
	}
	
	public int cantidadDeMultiplos(int n) {
		int cantidad = 0;
		for (Integer numero : this.getNumeros()) {
			if (numero % n == 0) cantidad++;
		}
		return cantidad;
	}

	public void addNumber(int i) {
		this.getNumeros().add(i);
	}
	
	//public Counter addNumber(int i) {
	//	this.getNumeros().add(i);
	//	return this;
	//}
	public int numeroConMasDigitosPares() {
		
		return 0;
	}

	public int cantDigitosPares(int x) {
		int cantPares = 0;
		int digito;
		while (x > 0) {
			digito = x % 10;
			if (digito % 2 == 0) cantPares++;
			x = x/10;
		}
		return cantPares;
	}
}
