package modelo;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El aeroplano está despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El aeroplano está aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El aeroplano está volando";
	}

}
