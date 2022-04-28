package ar.edu.unq.po2.tp3;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.setCoordenada(x, y);
	}
	public Point() {
		
	}
	private void setCoordenada(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void moverPunto(int x, int y) {
		this.setCoordenada(x, y);
	}
	public Point sumarPuntos(Point punto1, Point punto2) {
		int x = punto1.getX() + punto2.getX();
		int y = punto1.getY() + punto2.getY();
		Point nuevoPunto = new Point(x, y);
		return nuevoPunto;
	}
}
