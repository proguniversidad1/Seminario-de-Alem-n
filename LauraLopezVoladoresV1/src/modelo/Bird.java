package modelo;

public class Bird extends Animal implements Flyer{

	public String takeOff() {return "El ave está despegando";}

	public String land() {return "El ave está aterrizando";}

	public String fly() {return "El ave está volando";}

	public String buildNest() {return "El ave está construyendo un nido.";}
	
	public String layEggs() {return "El ave está poniendo huevos";}

	public String eat() {return super.eat();}
}
