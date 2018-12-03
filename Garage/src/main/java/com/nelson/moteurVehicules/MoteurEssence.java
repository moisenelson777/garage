package com.nelson.moteurVehicules;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ESSENCE);
	}
	
}
