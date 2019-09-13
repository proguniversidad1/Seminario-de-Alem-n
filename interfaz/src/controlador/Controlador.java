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
			mundo.getCuadrado().setLado(interfazV.darLado());			
			interfazV.darAreaPerimetro(mundo.getCuadrado().area(), mundo.getCuadrado().perimetro());
		} else {
			mundo.getCirculo().setRadio(interfazV.darRadio());			
			interfazV.darAreaPerimetro(mundo.getCirculo().area(), mundo.getCirculo().perimetro());

		}

		
	}

}
