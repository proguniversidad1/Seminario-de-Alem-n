package modelo;

public class Bird extends Animal implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El ave est� despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El ave est� aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El ave est� volando";
	}

	public String buildNest() {
		return "El ave est� construyendo un nido.";
	}
	
	public String layEggs() {
		return "El ave est� poniendo huevos";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat();
	}
}
