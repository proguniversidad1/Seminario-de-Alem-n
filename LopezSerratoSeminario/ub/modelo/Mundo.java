package modelo;

public class Mundo {
	
	private Seminario primerSeminario;
	
	private Archivo archivo;
	
	
	public Mundo() {
		
		primerSeminario = new Seminario();
		
		archivo = new Archivo();
	
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

	
}
