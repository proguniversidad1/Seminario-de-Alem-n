package controlador;

import mundo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo mundo;
	
	private Interfaz interfaz;
	
	
	public Controlador() {
		
		interfaz = new Interfaz();
		
		mundo = new Mundo(interfaz.darRutaNombres(), interfaz.darRutaSalida());
		
		int numEstudiantes = mundo.getArchivo().darNumEstudiantes();
		
		String[] listaRoles = mundo.getPrimerSeminario().darListaRoles(numEstudiantes);
		
		mundo.getArchivo().escribirRolesNombres(listaRoles, mundo.getPrimerSeminario().getNUMERO_SEMINARIO());
		
		String rutaProp = interfaz.darRutaProp();
		
		mundo.getPropiedades().setPropiedades(rutaProp);
		
		mundo.getPropiedades().getPropiedades(rutaProp);
		

	}
	
	

}
