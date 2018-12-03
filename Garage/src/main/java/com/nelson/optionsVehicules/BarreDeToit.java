package com.nelson.optionsVehicules;

public class BarreDeToit implements Option {

	@Override
	public Double getPrix() {
		
		return 29.9;
	}

	@Override
	public String toString() {
		String s = "GPS("+this.getPrix()+"€)";
		return s;
	}
}
