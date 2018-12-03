package com.nelson.moteurVehicules;

public abstract class Moteur {

	private TypeMoteur type = null;
	private String cylindre = null;
	private Double prix = null;
	
	/**Cette methode attribue les caractéristiques du moteurs.
	 * @param cylindre valeur String.
	 * @param prix valeur Double.
	 */
	public Moteur(String cylindre, Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	};
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String a = "Moteur "+ this.getType()+" "+this.getCylindre()+" ["+this.getPrix()+"€]";
		return a;
	};
	
	
	/**Cette methode renvoie le prix du moteur
	 * @return retourne valeur Double 
	 */
	public Double getPrix() {
		return  this.prix;
	}

	/**Cette methode renvoie le cylindre du moteur
	 * @return retourne valeur String 
	 */
	public String getCylindre() {
		return cylindre;
	}

	/**Cette methode renvoie le type de moteur
	 * @return retourne valeur TypeMoteur 
	 */
	public TypeMoteur getType() {
		return type;
	}

	/**Cette methode ajoute un type de moteur au véhicule
	 * @param type valeur TypeMoteur
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	};
	
}
