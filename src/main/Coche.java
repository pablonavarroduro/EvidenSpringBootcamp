package main;

public class Coche implements InterfazVehiculo {

	@Override
	public void numRuedas() {
		System.out.println("Ruedas: 4");
		
	}

	@Override
	public void numPlazas() {
		System.out.println("Plazas: 5");
		
	}

	@Override
	public void showName() {
		System.out.println("Coche");
		
	}

	

}
