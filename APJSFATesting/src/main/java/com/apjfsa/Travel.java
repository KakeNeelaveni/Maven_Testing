package com.apjfsa;

public class Travel {
	Vehicle vehicle;
	
	public Travel(Vehicle vehicle) {
		super();
		this.vehicle=vehicle;
	}

	public String travelConfirm() {
		if(vehicle.booking()!=0)
			return "confirmed";
		else
			return "not confirmed";
	}

}
