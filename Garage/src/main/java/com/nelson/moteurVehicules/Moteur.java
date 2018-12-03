package com.nelson.moteurVehicules;

public abstract class Moteur {

	TypeMoteur type = null;
	String cylindre = null;
	Double prix = null;
	
	public Moteur(String cylindre, Double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	};
	
	public String toString() {
		String a = "Moteur "+ this.getType()+" "+this.getCylindre()+" ["+this.getPrix()+"€]";
		return a;
	};
	
	
	public Double getPrix() {
		return  this.prix;
	}

	public String getCylindre() {
		return cylindre;
	}

	public TypeMoteur getType() {
		return type;
	}

	public void setType(TypeMoteur type) {
		this.type = type;
	};
	
}
