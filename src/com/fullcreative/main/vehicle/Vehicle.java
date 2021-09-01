package com.fullcreative.main.vehicle;

public interface Vehicle {

	String EMISSION_NORMS = "BSIV";

	public String start();

	public String stop();

	default void blowHorn() {
		System.out.println("Blowing horn");
	}

}
