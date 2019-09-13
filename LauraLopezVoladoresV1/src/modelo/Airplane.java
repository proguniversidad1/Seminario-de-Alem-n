package modelo;

public class Airplane extends Vehicle implements Flyer{
	
	public String takeOff() {return "El aeroplano está despegando";}
	public String land() {return "El aeroplano está aterrizando";}
	public String fly() {return "El aeroplano está volando";}

}
