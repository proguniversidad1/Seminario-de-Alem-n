package vista;

import javax.swing.JOptionPane;

public class InterfazV {
	
	public double darLado() {
		
		double lado = Double.parseDouble(JOptionPane.showInputDialog("De el lado del cuadrado"));
		
		return lado;
}
	
	public double darRadio() {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("De el radio del circulo"));
		
		return radio;
}
	
	public int darFigura() {
		
		int fElegida = Integer.parseInt(JOptionPane.showInputDialog("1 para cuadrado o 2 para circulo"));
		
		return fElegida;
	}
	
	public void darAreaPerimetro(double area, double perimetro) {
		JOptionPane.showMessageDialog(null, "El area del cuadrado es " + area + " y su perimtro es " + perimetro +".");
	}

}
