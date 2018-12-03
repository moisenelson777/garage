package com.nelson.main;

import com.nelson.main.Writer;
import com.nelson.categoriesVehicules.A300B;
import com.nelson.categoriesVehicules.D4;
import com.nelson.categoriesVehicules.Lagouna;
import com.nelson.categoriesVehicules.Vehicule;
import com.nelson.moteurVehicules.MoteurDiesel;
import com.nelson.moteurVehicules.MoteurElectrique;
import com.nelson.moteurVehicules.MoteurEssence;
import com.nelson.moteurVehicules.MoteurHybride;
import com.nelson.optionsVehicules.BarreDeToit;
import com.nelson.optionsVehicules.Climatisation;
import com.nelson.optionsVehicules.GPS;
import com.nelson.optionsVehicules.SiegeChauffant;
import com.nelson.optionsVehicules.VitreElectrique;


/**Cette classe déclenche l'application Garage. 
 * 
 */


public class MainGarage {

	
	public static void main(String[] args) {

		/*
		 * Instanciation du garage
		 */
		Garage garage = new Garage();
		
		/*
		 * Rajout des véhicules avec attributs respectifs
		 */
		Vehicule Lag1 = new Lagouna();
		Lag1.setMoteur(new MoteurEssence("150 Chevaux" , 23123.0d));
		Lag1.addOption(new GPS());
		Lag1.addOption(new SiegeChauffant());
		Lag1.addOption(new VitreElectrique());
		garage.addVoiture(Lag1);

		
		Vehicule A300B_2 = new A300B();
	   	A300B_2.setMoteur(new MoteurElectrique("1500 W", 28457.0d));
	   	A300B_2.addOption(new Climatisation());
	   	A300B_2.addOption(new BarreDeToit());
	   	A300B_2.addOption(new SiegeChauffant());
	   	garage.addVoiture(A300B_2);
	   	
	   	
	   	Vehicule d4_1 = new D4();
	   	d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25147.0d));
	   	d4_1.addOption(new BarreDeToit());
	   	d4_1.addOption(new Climatisation());
	   	d4_1.addOption(new GPS());
	   	garage.addVoiture(d4_1);   	 
	   	 
	   	Vehicule lag2 = new Lagouna();
	   	lag2.setMoteur(new MoteurDiesel("500 Hdi", 23123d));
	   	garage.addVoiture(lag2);
	   	 
	   	Vehicule A300B_1 = new A300B();
	   	A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 23123.0d));
	   	A300B_1.addOption(new VitreElectrique());
	   	A300B_1.addOption(new BarreDeToit());
	   	garage.addVoiture(A300B_1);
	   	 
	   	Vehicule d4_2 = new D4();
	   	d4_2.setMoteur(new MoteurElectrique("100 KW", 25147.0d));
	   	d4_2.addOption(new SiegeChauffant());
	   	d4_2.addOption(new BarreDeToit());
	   	d4_2.addOption(new Climatisation());
	   	d4_2.addOption(new GPS());
	   	d4_2.addOption(new VitreElectrique());
	   	garage.addVoiture(d4_2);   			 
	   	

	   	/*
	   	 * Affichage du garage via la console
	   	 */
	    /*  garage.generate(new Writer(){
            @Override
            public void start() {

            }

            @Override
            public void writeLine(String line) {
                System.out.println(line);
            }

            @Override
            public void stop() {

            }
        }); */
	   	
	   	/*
	   	 * Affichage du garage via le fichier txt.
	   	 */
	garage.generate(new FileWriter("Garage Automobile")); 
	}

}
