package com.nelson.moteurVehicules;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.DIESEL);
		
	}

}
