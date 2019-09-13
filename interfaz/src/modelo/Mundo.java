package modelo;

public class Mundo {
	
	private Cuadrado cuadrado;
	private Circulo circulo;
	
	public Mundo() {
		cuadrado = new Cuadrado();
		circulo = new Circulo();
	}

	public Cuadrado getCuadrado() {
		return cuadrado;
	}

	public void setCuadrado(Cuadrado cuadrado) {
		this.cuadrado = cuadrado;
	}

	public Circulo getCirculo() {
		return circulo;
	}

	public void setCirculo(Circulo circulo) {
		this.circulo = circulo;
	}
	
	

}
