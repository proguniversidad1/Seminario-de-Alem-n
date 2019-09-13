package modelo;

public class Cuadrado implements Figura {

	private double lado;
	
	public double area() {
		return lado*lado;
	}
	
	public double perimetro() {
		return 4*lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
