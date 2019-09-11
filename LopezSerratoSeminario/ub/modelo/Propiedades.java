package modelo;
import data.*;
import java.io.*;

import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
		
	private String archivoprop = "C:\\Users\\aulamovil09\\git\\Seminario-de-Alem-n\\LopezSerratoSeminario\\ub\\data\\archivo.properties";
	
	public void setPropiedades() {
			
		try {
			
			prop.setProperty("Proyecto", "Seminario"+" "+"Aleman");
		
			prop.setProperty("Autores", "Lopez;"+" "+"Serrato");
		
			prop.setProperty("ArchivoEntrada", "nombres.txt");
		
			prop.store(new FileOutputStream(archivoprop), null);
			
		}
		
		catch (IOException ex) {
			
		ex.printStackTrace();
		
		}
		
	}
	
	public void getPropiedades() {
		
		try {
			
			prop.load(new FileInputStream(archivoprop));
			
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