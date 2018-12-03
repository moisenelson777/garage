package com.nelson.optionsVehicules;

public class VitreElectrique implements Option {

	@Override
	public Double getPrix() {
		
		return 212.35;
	}

	@Override
	public String toString() {
		String s = "Vitre électrique("+this.getPrix()+"€)";
		return s;
	}
}
