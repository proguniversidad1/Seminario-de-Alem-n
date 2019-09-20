package vistaGUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel labIntento1;
	/*private JLabel labIntento2;*/

	private JTextField txtNumerosParaProbar1;
	private JTextField txtNumerosParaProbar2;
	private JTextField txtNumerosParaProbar3;
	private JTextField txtNumerosParaProbar4;
	
	/*private JTextField txtNumerosParaProbar5;
	private JTextField txtNumerosParaProbar6;
	private JTextField txtNumerosParaProbar7;
	private JTextField txtNumerosParaProbar8;*/
	
	private JButton butProbar;
	
	public JLabel getLabIntento1() {
		return labIntento1;
	}

	public void setLabIntento1(JLabel labIntento1) {
		this.labIntento1 = labIntento1;
	}

	public static final String PROBAR = "Probar";
	
	public PanelEntrada() {
		
		setLayout(new GridLayout(2, 5));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		labIntento1 = new JLabel("Intento 1:");
		
		txtNumerosParaProbar1 = new JTextField("");
		txtNumerosParaProbar1.setForeground(Color.BLACK);
		txtNumerosParaProbar1.setBackground(Color.WHITE);
		
		txtNumerosParaProbar2 = new JTextField("");
		txtNumerosParaProbar2.setForeground(Color.BLACK);
		txtNumerosParaProbar2.setBackground(Color.WHITE);
		
		txtNumerosParaProbar3 = new JTextField("");
		txtNumerosParaProbar3.setForeground(Color.BLACK);
		txtNumerosParaProbar3.setBackground(Color.WHITE);
		
		txtNumerosParaProbar4 = new JTextField("");
		txtNumerosParaProbar4.setForeground(Color.BLACK);
		txtNumerosParaProbar4.setBackground(Color.WHITE);
		
		/*labIntento2 = new JLabel("Intento 2:");
		
		txtNumerosParaProbar5 = new JTextField("");
		txtNumerosParaProbar5.setForeground(Color.BLACK);
		txtNumerosParaProbar5.setBackground(Color.WHITE);
		
		txtNumerosParaProbar6 = new JTextField("");
		txtNumerosParaProbar6.setForeground(Color.BLACK);
		txtNumerosParaProbar6.setBackground(Color.WHITE);
		
		txtNumerosParaProbar7 = new JTextField("");
		txtNumerosParaProbar7.setForeground(Color.BLACK);
		txtNumerosParaProbar7.setBackground(Color.WHITE);
		
		txtNumerosParaProbar8 = new JTextField("");
		txtNumerosParaProbar8.setForeground(Color.BLACK);
		txtNumerosParaProbar8.setBackground(Color.WHITE);*/
		
		butProbar = new JButton("Probar");
		butProbar.setActionCommand(PROBAR);
		
		add(labIntento1);add(txtNumerosParaProbar1);add(txtNumerosParaProbar2);add(txtNumerosParaProbar3);add(txtNumerosParaProbar4);
		/*add(labIntento2);add(txtNumerosParaProbar5);add(txtNumerosParaProbar6);add(txtNumerosParaProbar7);add(txtNumerosParaProbar8);	*/	
		add(new JLabel(""));add(new JLabel(""));add(butProbar);add(new JLabel(""));add(new JLabel(""));
		
		
	}

	public JTextField getTxtNumerosParaProbar1() {
		return txtNumerosParaProbar1;
	}

	public void setTxtNumerosParaProbar1(JTextField txtNumerosParaProbar1) {
		this.txtNumerosParaProbar1 = txtNumerosParaProbar1;
	}

	public JTextField getTxtNumerosParaProbar2() {
		return txtNumerosParaProbar2;
	}

	public void setTxtNumerosParaProbar2(JTextField txtNumerosParaProbar2) {
		this.txtNumerosParaProbar2 = txtNumerosParaProbar2;
	}

	public JTextField getTxtNumerosParaProbar3() {
		return txtNumerosParaProbar3;
	}

	public void setTxtNumerosParaProbar3(JTextField txtNumerosParaProbar3) {
		this.txtNumerosParaProbar3 = txtNumerosParaProbar3;
	}

	public JTextField getTxtNumerosParaProbar4() {
		return txtNumerosParaProbar4;
	}

	public void setTxtNumerosParaProbar4(JTextField txtNumerosParaProbar4) {
		this.txtNumerosParaProbar4 = txtNumerosParaProbar4;
	}

	/*public JTextField getTxtNumerosParaProbar5() {
		return txtNumerosParaProbar5;
	}

	public void setTxtNumerosParaProbar5(JTextField txtNumerosParaProbar5) {
		this.txtNumerosParaProbar5 = txtNumerosParaProbar5;
	}

	public JTextField getTxtNumerosParaProbar6() {
		return txtNumerosParaProbar6;
	}

	public void setTxtNumerosParaProbar6(JTextField txtNumerosParaProbar6) {
		this.txtNumerosParaProbar6 = txtNumerosParaProbar6;
	}

	public JTextField getTxtNumerosParaProbar7() {
		return txtNumerosParaProbar7;
	}

	public void setTxtNumerosParaProbar7(JTextField txtNumerosParaProbar7) {
		this.txtNumerosParaProbar7 = txtNumerosParaProbar7;
	}

	public JTextField getTxtNumerosParaProbar8() {
		return txtNumerosParaProbar8;
	}

	public void setTxtNumerosParaProbar8(JTextField txtNumerosParaProbar8) {
		this.txtNumerosParaProbar8 = txtNumerosParaProbar8;
	}*/

	public JButton getButProbar() {
		return butProbar;
	}

	public void setButProbar(JButton butProbar) {
		this.butProbar = butProbar;
	}

}
