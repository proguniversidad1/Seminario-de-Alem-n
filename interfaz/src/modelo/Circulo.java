package modelo;

public class Circulo implements Figura{

	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static double getPI() {
		return PI;
	}

	public static void setPI(double pI) {
		PI = pI;
	}

	private static double PI = 3.1416;
	
	public double area() {
		return PI*radio*radio;
	}
	
	public double perimetro() {
		return 2*PI*radio;
	}
}
