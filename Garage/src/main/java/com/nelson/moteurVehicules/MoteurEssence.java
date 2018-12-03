package com.nelson.moteurVehicules;

public class MoteurEssence extends Moteur {

	/**Ce constructeur cr�e un type de moteur essence.
	 * @param cylindre valeur String
	 * @param prix valeur Double
	 */
	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ESSENCE);
	}
	
}
