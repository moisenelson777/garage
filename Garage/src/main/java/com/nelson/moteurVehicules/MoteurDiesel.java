package com.nelson.moteurVehicules;

public class MoteurDiesel extends Moteur {

	/**Ce constructeur crée un type de moteur diesel.
	 * @param cylindre valeur String
	 * @param prix valeur Double
	 */
	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		this.setType(TypeMoteur.DIESEL);
		
	}

}
