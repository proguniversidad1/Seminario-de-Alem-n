package modelo;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El aeroplano est� despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El aeroplano est� aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El aeroplano est� volando";
	}

}
