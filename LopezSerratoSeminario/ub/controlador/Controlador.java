package controlador;

import modelo.Mundo;

public class Controlador {
	
	private Mundo mundo;
	
	
	public Controlador() {
		
		mundo = new Mundo();
		
		int numEstudiantes = mundo.getArchivo().darNumEstudiantes();
		
		String[] listaRoles = mundo.getPrimerSeminario().darListaRoles(numEstudiantes);
		
		mundo.getArchivo().escribirRolesNombres(listaRoles, mundo.getPrimerSeminario().getNUMERO_SEMINARIO());

	}
	
	

}
