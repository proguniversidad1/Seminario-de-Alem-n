package controlador;

import modelo.Mundo;
import vista.InterfazV;

public class Controlador {
	
	private Mundo mundo;
	private InterfazV interfazV;
	
	public Controlador() {
		
		mundo = new Mundo();
		interfazV = new InterfazV();
		
		int figura = interfazV.darFigura();
		
		if (figura == 1) {
			double area = mundo.getFigura().calcularArea(interfazV.darLado());		
			interfazV.darArea(area);
		} else {
			double area = mundo.getFigura().calcularArea(interfazV.darRadio(),Math.PI);			
			interfazV.darArea(area);

		}

		
	}

}
