package com.nelson.moteurVehicules;

public class MoteurElectrique extends Moteur {

	/**Ce constructeur crée un type de moteur électrique.
	 * @param cylindre valeur String
	 * @param prix valeur Double
	 */
	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
	}

}
