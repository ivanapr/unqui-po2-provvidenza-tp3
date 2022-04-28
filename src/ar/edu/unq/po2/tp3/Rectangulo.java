package ar.edu.unq.po2.tp3;

public class Rectangulo {
	int ancho, largo;
	Point esquinaInfIzq;
	
	public Rectangulo(Point punto, int ancho, int largo) {
		this.setEsquinaInfIzq(esquinaInfIzq);
		this.setAncho(ancho);
		this.setLargo(largo);
	}
	public int getAncho() {
		return ancho;
	}
	private void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLargo() {
		return largo;
	}
	private void setLargo(int largo) {
		this.largo = largo;
	}
	public void setEsquinaInfIzq(Point esquinaInfIzq) {
		this.esquinaInfIzq = esquinaInfIzq;
	}
	public int getArea() {
		return this.getLargo() * this.getAncho();
	}
	public int getPerimetro() {
		return (this.getAncho() * 2) + (this.getLargo() * 2);
	}
	public boolean esHorizontal() {
		return this.getAncho() > this.getLargo();
	}
	public boolean esVertical() {
		return this.getAncho() < this.getLargo();
	}
}
