package com.fullcreative.main.vehicle;

public class DriverClass {

	public static void main(String[] args) {
		
		Truck tata = new Truck();

		VehicleRunner runner = new VehicleRunner(tata);

		runner.vehicleWork();
	}
}
