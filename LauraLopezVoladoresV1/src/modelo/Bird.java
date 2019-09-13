package modelo;

public class Bird extends Animal implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El ave está despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El ave está aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El ave está volando";
	}

	public String buildNest() {
		return "El ave está construyendo un nido.";
	}
	
	public String layEggs() {
		return "El ave está poniendo huevos";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat();
	}
}
