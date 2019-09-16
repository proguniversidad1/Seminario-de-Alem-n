package controlador;

import modelo.Mundo;
import vista.InterfazV;

public class Controlador {
	
	private Mundo mundo;
	private InterfazV interfazV;
	
	public Controlador() {
		
		mundo = new Mundo();
		interfazV = new InterfazV();
		
		interfazV.darLinea(mundo.hacerPolimorfismo());

		
	}

}
