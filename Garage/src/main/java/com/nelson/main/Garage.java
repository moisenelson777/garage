package com.nelson.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nelson.categoriesVehicules.Vehicule;


public class Garage {

	 List <Vehicule> voitures = new ArrayList<Vehicule> ();
	 
	 public String toString() {
		 //TODO
		 return (" ");
	 }
	 
	 public void addVoiture(Vehicule vehicule) {
			this.voitures.add(vehicule);
			
			
		}
	 
	/* public void afficherGarage() {
		 System.out.println("****************************************************************************************************************************************************************");
		 System.out.println("*                                                     		OpenClassrooms						                                       *");
		 System.out.println("****************************************************************************************************************************************************************");
		 System.out.println("\t");
		 for (Vehicule vehicule : voitures) {
			vehicule.afficherVehicule();
		}
	 }	*/
	 
	 public void generate(Writer writer) {
		 if (voitures.isEmpty())
		        throw new NoProductInBillException();
	    writer.start();
	    writer.writeLine("****************************************************************************************************************************************************************");
	    writer.writeLine("*                                                     		OpenClassrooms						                                       *");
	    writer.writeLine("****************************************************************************************************************************************************************");
	    writer.writeLine("\t");
	    for (Vehicule vehicule : voitures) {
	    	writer.writeLine(vehicule.toString());
		}
	    writer.stop();
	}
	
}
