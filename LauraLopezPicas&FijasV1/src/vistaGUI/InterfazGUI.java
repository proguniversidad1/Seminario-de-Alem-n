package vistaGUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	
	PanelEntrada panelEntrada;
	PanelResultados panelResultados;
	
	public InterfazGUI(Controlador control) {
		
		setSize(400, 200);
		setResizable(false);
		setTitle("Picas & Fijas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelEntrada = new PanelEntrada();
		add(panelEntrada, BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.CENTER);
		
		panelEntrada.getButProbar().addActionListener(control);

	}
	
	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}
	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

}
