package com.nelson.optionsVehicules;

public class GPS implements Option {

	
	
	public GPS() {
		super();
	}

	@Override
	public Double getPrix() {
		
		return 113.5;
	}

	@Override
	public String toString() {
		String s = "GPS("+this.getPrix()+"€)";
		return s;
	}
	
	
}
