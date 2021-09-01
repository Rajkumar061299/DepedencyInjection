package com.fullcreative.main.vehicle;

public class Truck implements Vehicle {

	@Override
	public String start() {
		return "starting truck engine...";

	}

	@Override
	public String stop() {
		return "stopping truck engine...";

	}

}
