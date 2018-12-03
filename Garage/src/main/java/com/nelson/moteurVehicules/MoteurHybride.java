package com.nelson.moteurVehicules;

public class MoteurHybride extends Moteur {

	/**Ce constructeur crée un type de moteur hybride.
	 * @param cylindre valeur String
	 * @param prix valeur Double
	 */
	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.HYBRIDE);
	}

}
