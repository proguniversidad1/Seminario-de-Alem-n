package vista;

import javax.swing.JFileChooser;

public class Interfaz {
	
	private JFileChooser buscador = new JFileChooser();
	
		public String darRutaNombres() {
			
			System.out.println("Elija el archivo de nombres");
			
			buscador.showOpenDialog(buscador);
					
			String rutaNombres = buscador.getSelectedFile().getAbsolutePath();
			
			return rutaNombres;
		
		}
		
		public String darRutaSalida() {
			
			System.out.println("Elija donde guardar la salida");
			
			buscador.showSaveDialog(buscador);
					
			String rutaSalida = buscador.getSelectedFile().getAbsolutePath();
			
			return rutaSalida;
	}
		
		
		public String darRutaProp() {
			
			buscador.showSaveDialog(buscador);
			
			System.out.println("Elija donde guardar las propiedades");
			
			String rutaProp = buscador.getSelectedFile().getAbsolutePath();
			
			return rutaProp;
			
		}

}
