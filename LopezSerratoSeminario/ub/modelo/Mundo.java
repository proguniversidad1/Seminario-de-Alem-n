package modelo;

public class Mundo {
	
	private Seminario primerSeminario;
	
	private Archivo archivo;
	
	private Propiedades propiedades;
	
	
	public Mundo(String pRutaNombres, String pRutaSalida) {
		
		primerSeminario = new Seminario();
		
		archivo = new Archivo(pRutaNombres, pRutaSalida);
		
		propiedades = new Propiedades();
	
	}
	

	public Archivo getArchivo() {
		return archivo;
	}


	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}


	public Seminario getPrimerSeminario() {
		return primerSeminario;
	}

	public void setPrimerSeminario(Seminario primerSeminario) {
		this.primerSeminario = primerSeminario;
	}


	public Propiedades getPropiedades() {
		return propiedades;
	}


	public void setPropiedades(Propiedades propiedades) {
		this.propiedades = propiedades;
	}

	
}
