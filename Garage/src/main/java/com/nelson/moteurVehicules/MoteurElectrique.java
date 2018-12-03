package com.nelson.moteurVehicules;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
	}

}
