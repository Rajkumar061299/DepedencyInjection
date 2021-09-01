package com.fullcreative.main.vehicle;

public class Car implements Vehicle {

	@Override
	public String start() {
		return "starting car engine...";

	}

	@Override
	public String stop() {
		return "stopping car engine...";

	}

}
