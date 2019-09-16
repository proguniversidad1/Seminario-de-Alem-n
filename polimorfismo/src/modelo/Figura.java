package modelo;

public class Figura {
	
	public double calcularArea(double radio, double pi) {
		return pi*radio*radio;
	}
	
	public double calcularArea(double lado) {
		return lado*lado;
	}

}
