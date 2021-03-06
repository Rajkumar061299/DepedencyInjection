package com.fullcreative.main.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.fullcreative.main.vehicle.Car;
import com.fullcreative.main.vehicle.Truck;
import com.fullcreative.main.vehicle.Vehicle;
import com.fullcreative.main.vehicle.VehicleRunner;

class VehicleRunnerTest {

	VehicleRunner runner;

	@Test
	void testWithTruck() {
		Truck tata = new Truck();
		runner = new VehicleRunner(tata);
		Vehicle vehicle = runner.getVehicle();
		assertEquals("starting truck engine...", vehicle.start());
		assertEquals("stopping truck engine...",vehicle.stop());

	}
	
	@Test
	void testWithCar() {
		Car tesla = new Car();
		runner = new VehicleRunner(tesla);
		Vehicle vehicle = runner.getVehicle();
		assertEquals("starting car engine...", vehicle.start());
		assertEquals("stopping car engine...",vehicle.stop());

	}
	
}
