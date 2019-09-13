package modelo;

public class Superman extends Kryptonian implements Flyer{

	public String takeOff() {return "Superman está despegando";}

	public String land() {return "Superman está aterrizando";}

	public String fly() {return "Es un avión , es una ave, Nooo... es Superman";}
	
	public String leapBuilding() {return "Superman saltó un edificio.";}
	
	public String stopBullet() {return "Sepuerman paró la bala.";}

	public String eat() {return super.eat();}
	

}
