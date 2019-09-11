package modelo;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import data.*;

public class Archivo {
	
	private File nombres;
	
	private File salida;
	
	private FileReader fileReader;
	
	private BufferedReader bufferedReader;
	
	private FileWriter fileWriter;
	
	private PrintWriter printWriter;
	
	private JFileChooser buscador;
	
	
	
	public Archivo() {
		
		buscador = new JFileChooser();
		
		nombres = new File(darRutaNombres());
		
		salida = new File(darRutaSalida());
		
		
	}
	
	public String darRutaNombres() {
		
		buscador.showOpenDialog(buscador);
		
		System.out.println("Elija el archivo de nombres");
		
		String rutaNombres = buscador.getSelectedFile().getAbsolutePath();
		
		return rutaNombres;
	
	}
	
	public String darRutaSalida() {
		
		buscador.showSaveDialog(buscador);
		
		System.out.println("Elija donde guardar la salida");
		
		String rutaSalida = buscador.getSelectedFile().getAbsolutePath();
		
		return rutaSalida;
	}
	
	public int darNumEstudiantes() {
		
		int contador = 0;
		
		try {
			
			fileReader = new FileReader(nombres);
			
			bufferedReader = new BufferedReader(fileReader);
			
			String linea = bufferedReader.readLine();
			
			while (linea != null) {
				
				linea = bufferedReader.readLine();
				
				contador++;
				
			}
			
			fileReader.close();	
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return contador;
		
	}

	public String[] darListaEstudiantes() {
		
		int numEstudiantes = darNumEstudiantes();
		
		String[] listaNombres = new String[numEstudiantes];
		
		try {
			
			fileReader = new FileReader(nombres);
			
			bufferedReader = new BufferedReader(fileReader);
						
			for (int i = 0; i < listaNombres.length; i++) {
				
				listaNombres[i] = bufferedReader.readLine();
				
			}
			
			fileReader.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
			
		}
		
		return listaNombres;
		
	}
	
	public void escribirRolesNombres(String[] pListaRoles, int nSeminario){
		
		try {
			
			fileWriter = new FileWriter(salida);
			
			printWriter = new PrintWriter(fileWriter);
			
			int numEstudiantes2 = darNumEstudiantes();
			
			String[] salida = new String[numEstudiantes2];
			
			printWriter.println("Bienvenido a la reunión del seminario de alemán número "+nSeminario+"."
								+"\n"
								+"\n"+"Si estas designado con la letra C, entonces tu función es la de un contradictor."
								+"\n"+"Si estas designado con la letra P, entonces tu función es la de un protocolario."
								+"\n"+"Si estas designado con la letra R, entonces tu función es la de un relator."
								+"\n");
			
			for (int i = 0; i < numEstudiantes2 ; i++) {
				
				salida[i] = pListaRoles[i]+ darListaEstudiantes()[i];
				
					
				printWriter.println(salida[i]);
				
				
				}		
				
			fileWriter.close();
			
		} catch (Exception e) {
			
			System.out.println("error");
		}
		
		
	}

}
