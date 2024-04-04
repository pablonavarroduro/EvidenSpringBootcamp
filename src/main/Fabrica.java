package main;

public class Fabrica {
	InterfazVehiculo iveh;
	
	public Fabrica(InterfazVehiculo veh) {
		this.iveh = veh;
	}
	
	public void getRuedas() {
		this.iveh.numRuedas();
	}
	
	public void getPlazas() {
		this.iveh.numPlazas();
	}
}
