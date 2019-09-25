package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vistaGUI.InterfazGUI;
import vistaGUI.PanelEntrada;

public class Controlador implements ActionListener{
	
	private Mundo mundo;
	
	private InterfazGUI gui;
	
	private int contador=2;
	
	private int[] numerosParaAdivinar;
	public Controlador() {
		
		mundo = new Mundo();
		gui = new InterfazGUI(this);
		
		numerosParaAdivinar = mundo.getJuego().numerosPorAdivinar();
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		gui.getPanelEntrada();		
		
		
			
		if (evento.getActionCommand().equals(PanelEntrada.PROBAR)) {
			
			if (contador<12) {
				
				int numerosParaProbar[] = new int[4];
				
				for (int i = 0; i < numerosParaProbar.length; i++) {
					numerosParaProbar[i] = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar0().getText().substring(i, i+1));
				}
						
				int picas = mundo.getJuego().darNumPicas(numerosParaAdivinar, numerosParaProbar);
				int fijas = mundo.getJuego().darNumFijas(numerosParaAdivinar, numerosParaProbar);
						
				gui.getPanelResultados().getTxtPicas().setText(picas + "");
				gui.getPanelResultados().getTxtFijas().setText(fijas + "");
				
				if (fijas==4) {
					JOptionPane.showMessageDialog(null, "¡Felidades, lo adivinaste!");
				}
				
				System.out.println(numerosParaAdivinar[0] + " " + numerosParaAdivinar[1] + " " + numerosParaAdivinar[2] + " " + numerosParaAdivinar[3]);
				
				gui.getPanelEntrada().getTxtNumerosParaProbar0().setText("");				
					
				gui.getPanelEntrada().getLabIntento1().setText("Intento "+contador);
				
				contador++;	
				
			} else {
				
				String nums = numerosParaAdivinar[0] + " " + numerosParaAdivinar[1] + " " + numerosParaAdivinar[2] + " " + numerosParaAdivinar[3] ; 


				JOptionPane.showMessageDialog(null, "Excediste el número de intentos" + "Respuesta: "+ nums);
			}
		
		
		}		
	}

}
