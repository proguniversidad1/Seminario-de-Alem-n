package mundo;

public class Mundo {
	
	private Juego juego;
	private Resultado resultado;
	
	
	
	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Mundo(String rutaResultados) {
		juego = new Juego();
		resultado = new Resultado(rutaResultados);
		
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

}
