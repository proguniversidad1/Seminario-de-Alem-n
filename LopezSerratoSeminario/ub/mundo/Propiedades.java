package mundo;
import java.io.*;

import java.util.Properties;


public class Propiedades {
	
	private Properties prop = new Properties();
	
	
	public void setPropiedades(String pRutaProp) {
			
		try {
			
			prop.setProperty("Proyecto", "Seminario"+" "+"Aleman");
		
			prop.setProperty("Autores", "Lopez;"+" "+"Serrato");
		
			prop.setProperty("ArchivoEntrada", "nombres.txt");
		
			prop.store(new FileOutputStream(pRutaProp), null);
			
		}
		
		catch (IOException ex) {
			
		ex.printStackTrace();
		
		}
		
	}

	
	public void getPropiedades(String pRutaProp) {
		
		try {
			
			prop.load(new FileInputStream(pRutaProp));
			
			prop.list(System.out);
			
			System.out.println("");
			
			System.out.println(prop.getProperty("Proyecto"));
			
			System.out.println(prop.getProperty("Autores"));
			
			System.out.println(prop.getProperty("ArchivoEntrada"));
			
		} catch (IOException ex) {
			
			ex.printStackTrace();
			
		}

	}

}