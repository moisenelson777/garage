package com.nelson.categoriesVehicules;

import java.util.ArrayList;
import java.util.List;

import com.nelson.moteurVehicules.Moteur;
import com.nelson.optionsVehicules.Option;


/**Cette classe d�finit chaque vehicule.
 * @author moise
 *
 */
public class Vehicule  {

	/**
	 * List<Option> liste des options du v�hicules.
	 */
	private List<Option> options;
	/**
	 * Marque marque du vehicule.
	 */
	private Marque nomMarque;

	/**
	 * Moteur type de moteur du vehicule.
	 */
	private Moteur moteur;
	/**
	 * Double montant total des options du v�hicule.
	 */
	private Double prixDesOptions = 0.0;
	/**
	 * Double prix du vehicule uniquement non utilis� pour ce tp
	 */
	private Double prixVehiculeSeul = 0.0;
	
    /** 
     * Ce construteur Vehicule instancie en ArrayList les options du v�hicule. 
     */
    public Vehicule() {
		this.options = new ArrayList<Option>();
	}

    
	/* Cette methode affcihe le v�hicule et ses caract�ritiques
	 * @return chaine de caract�re marque, type de moteur, options, valeur totale du vehicule.
	 */
	public String toString() {
		
		return ("* Voiture "+this.getNomMarque()+" "+this.getClass().getSimpleName()+" "+this.moteur.toString()+" "+this.options+" d'une valeur totale de : "+(this.getPrix() + getPrixDesOptions())+"�");

	}
	
	/**Cette methode ajoute une option au vehicule
	 * @param opt valeur Option.
	 */
	public void addOption(Option opt) {
		this.options.add(opt);
	}

	
	/**Cette methode renvoie le prix du moteur et du vehicule seul
	 * @return retourne une valeur Double;
	 */
	public Double getPrix() {
		Double valeur = this.moteur.getPrix();
		return valeur;
	}

	/**Cette methode renvoie la liste des options du vehicule.
	 * @return retourne une valeur List<options>
	 */
	public List<Option> getOptions() {
		
		return this.options;
	}

	
	/**Cette methode attribue une marque � un v�hicule
	 * @param nomMarque valeur Marque
	 */
	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	
	/**Cette methode renvoie la marque du v�hicule selon son nom.
	 * @return retourne une valeur Marque
	 */
	public Marque getNomMarque() {
		if (this.getClass().getSimpleName() == "Lagouna") {
			return Marque.RENAULT;
		}else if (this.getClass().getSimpleName() == "D4") {
			return Marque.CITROYEN;
		}else if (this.getClass().getSimpleName() == "A300B") {
			return Marque.PEUGEOT;
		};
		return this.nomMarque;
	}

	/**Cette methode rajoute un type de moteur au vehicule.
	 * @param moteur valeur Moteur.
	 */
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	
	/**Cette methode renvoie le type de moteur du vehicule.
	 * @return retourne une valeur Moteur
	 */
	public Moteur getMoteur() {
		return moteur;
	}
	
	
	/**Cette methode renvoie le prix total des differentes options du v�hicule.
	 * @return retourne une valeur Double
	 */
	public double getPrixDesOptions() {
	for(int i = 0; i < this.options.size(); i++){
		this.prixDesOptions +=  this.options.get(i).getPrix();
		
	 	}
     return prixDesOptions;
    
    }
}

