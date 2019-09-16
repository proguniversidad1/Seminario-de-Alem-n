package modelo;

public class Mundo {
	
	private Persona personas[];
	
	public Mundo() {
		
		personas = new Persona[3];
		
	}
	
	public String hacerPolimorfismo() {
		
		String linea = "";
		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
		for (int i=0 ; i<3; i++)
		linea += personas[i]+" \n";
		return linea;
		}


	
	

}
