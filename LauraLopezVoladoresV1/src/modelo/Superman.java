package modelo;

public class Superman extends Kryptonian implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Superman est� despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman est� aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Es un avi�n , es una ave, Nooo... es Superman";
	}
	
	public String leapBuilding() {
		return "Superman salt� un edificio.";
	}
	
	public String stopBullet() {
		return "Sepuerman par� la bala.";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat();
	}
	

}
