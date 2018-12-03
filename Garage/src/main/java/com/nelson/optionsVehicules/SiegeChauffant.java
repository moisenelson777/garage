package com.nelson.optionsVehicules;

public class SiegeChauffant implements Option {

	@Override
	public Double getPrix() {
		
		return 562.9;
	}

	@Override
	public String toString() {
		String s = "Siège chauffant ("+this.getPrix()+"€)";
		return s;
	}
}
