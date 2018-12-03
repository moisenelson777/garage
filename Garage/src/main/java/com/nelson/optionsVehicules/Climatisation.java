package com.nelson.optionsVehicules;

public class Climatisation implements Option {

	@Override
	public Double getPrix() {
		
		return 347.3;
	}
	
	@Override
	public String toString() {
		String s = "Climatisation("+this.getPrix()+"€)";
		return s;
	}
}
