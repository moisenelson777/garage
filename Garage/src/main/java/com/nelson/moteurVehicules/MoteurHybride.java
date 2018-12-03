package com.nelson.moteurVehicules;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.HYBRIDE);
	}

}
