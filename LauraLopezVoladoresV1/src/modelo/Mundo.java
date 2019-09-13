package modelo;

public class Mundo {
	
	private Superman superman;
	private Bird bird;
	private SeaPlane seaPlane;
	private Helicopter helicopter;
	
	public Mundo() {
		superman = new Superman();
		bird = new Bird();
		seaPlane = new SeaPlane();
		helicopter = new Helicopter();
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public SeaPlane getSeaPlane() {
		return seaPlane;
	}

	public void setSeaPlane(SeaPlane seaPlane) {
		this.seaPlane = seaPlane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}
	
	

}
