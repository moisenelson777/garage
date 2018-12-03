package com.nelson.moteurVehicules;

public class MoteurElectrique extends Moteur {

	/**Ce constructeur cr�e un type de moteur �lectrique.
	 * @param cylindre valeur String
	 * @param prix valeur Double
	 */
	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.ELECTRIQUE);
	}

}
