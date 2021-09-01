package com.fullcreative.main.vehicle;

public class VehicleRunner {

	private Vehicle vehicle;

	public void vehicleWork() {

		System.out.println(getVehicle().start());
		getVehicle().blowHorn();
		System.out.println(getVehicle().stop());

	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
