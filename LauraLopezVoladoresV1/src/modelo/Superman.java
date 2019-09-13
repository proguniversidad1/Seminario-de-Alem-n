package modelo;

public class Superman extends Kryptonian implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Superman está despegando";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman está aterrizando";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Es un avión , es una ave, Nooo... es Superman";
	}
	
	public String leapBuilding() {
		return "Superman saltó un edificio.";
	}
	
	public String stopBullet() {
		return "Sepuerman paró la bala.";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat();
	}
	

}
