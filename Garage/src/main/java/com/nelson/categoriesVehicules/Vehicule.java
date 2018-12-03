package com.nelson.categoriesVehicules;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.nelson.moteurVehicules.Moteur;
import com.nelson.optionsVehicules.Option;

public class Vehicule  {

	Double prix = 0.0;
	String nom;
	List<Option> options;
	Marque nomMarque;
	Moteur moteur;
	Double prixDesOptions = 0.0;
	Double prixVehiculeSeul = 0.0;
	
    public Vehicule() {
		this.options = new ArrayList<Option>();
	}

	public String toString() {
		
		return ("* Voiture "+this.getNomMarque()+" "+this.getClass().getSimpleName()+" "+this.moteur.toString()+" "+this.options+" d'une valeur totale de : "+(this.getPrix() + getPrixDesOptions())+"€");

	}
    
    public void afficherVehicule() {
    	System.out.println("* Voiture "+this.getNomMarque()+" "+this.getClass().getSimpleName()+" "+this.moteur.toString()+" "+this.options+" d'une valeur totale de : "+(this.getPrix() + getPrixDesOptions())+"€");
    
    }
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}

	public Double getPrix() {
		Double valeur = this.moteur.getPrix();
		return valeur;
	}

	public List<Option> getOptions() {
		
		return this.options;
	}

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

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Moteur getMoteur() {
		return moteur;
	}
	
	//Méthode pour calculer le prix de toutes les otpions sur un véhicule
	
	public double getPrixDesOptions() {
	for(int i = 0; i < this.options.size(); i++){
		this.prixDesOptions +=  this.options.get(i).getPrix();
		
	 	}
     return prixDesOptions;
    
    }
}

