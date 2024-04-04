package main;

public class Autobus implements InterfazVehiculo {

	
	@Override
	public void numRuedas() {
		System.out.println("Ruedas: 6");
		
	}

	@Override
	public void numPlazas() {
		System.out.println("Plazas: 80");
		
	}

	@Override
	public void showName() {
		System.out.println("Autobus");
		
	}

}
