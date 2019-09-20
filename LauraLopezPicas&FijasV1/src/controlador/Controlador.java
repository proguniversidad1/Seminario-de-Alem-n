package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vistaGUI.InterfazGUI;
import vistaGUI.PanelEntrada;

public class Controlador implements ActionListener{
	
	@SuppressWarnings("unused")
	private Mundo mundo;
	
	private InterfazGUI gui;
	
	public Controlador() {
		
		mundo = new Mundo();
		gui = new InterfazGUI(this);
		
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		gui.getPanelEntrada();
		
		int contador=2;
			
		if (evento.getActionCommand().equals(PanelEntrada.PROBAR)) {
			
			
				
			int a = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar1().getText());
			int b = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar2().getText());
			int c = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar3().getText());
			int d = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar4().getText());
			
			int[] nums = new int[4];
				
			nums[0]=a;
			nums[1]=b;
			nums[2]=c;
			nums[3]=d;
					
			int picas = mundo.getJuego().darNumPicas(nums);
			int fijas = mundo.getJuego().darNumFijas(nums);
					
			gui.getPanelResultados().getTxtPicas().setText(picas + "");
			gui.getPanelResultados().getTxtFijas().setText(fijas + "");
			
			gui.getPanelEntrada().getTxtNumerosParaProbar1().setText("");
			gui.getPanelEntrada().getTxtNumerosParaProbar2().setText("");
			gui.getPanelEntrada().getTxtNumerosParaProbar3().setText("");
			gui.getPanelEntrada().getTxtNumerosParaProbar4().setText("");
				
			
				
			gui.getPanelEntrada().getLabIntento1().setText("Intento "+contador);
			
			contador++;	
			
			}
		
		
		}		
		
		
			
		
		/*if (evento.getActionCommand().equals(PanelEntrada.PROBAR)) {
			
			int a = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar1().getText());
			int b = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar2().getText());
			int c = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar3().getText());
			int d = Integer.parseInt(gui.getPanelEntrada().getTxtNumerosParaProbar4().getText());
			
			int[] nums = new int[4];
			
			nums[0]=a;
			nums[1]=b;
			nums[2]=c;
			nums[3]=d;
			
			int picas = mundo.getJuego().darNumPicas(nums);
			int fijas = mundo.getJuego().darNumFijas(nums);
			
			gui.getPanelResultados().getTxtPicas().setText(picas + "");
			gui.getPanelResultados().getTxtFijas().setText(fijas + "");
			
		}*/
		
	

	/*public void actionPerformed(ActionEvent evento) {
		gui.getPanelEntrada();
		if (evento.getActionCommand().equals(PanelEntrada.PROBAR)) {
			gui.getPanelResultados().getTxtMonto().setText(gui.getPanelEntrada().getTxtNumero().getText()+" Procesado");
		}
	}*/

}
