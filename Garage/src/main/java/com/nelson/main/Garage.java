package com.nelson.main;

import java.util.ArrayList;
import java.util.List;

import com.nelson.categoriesVehicules.Vehicule;


/**Cette classe recoit l'ensemble des vehicules et les affiche.
 * @author moise
 *
 */
public class Garage {

	 List <Vehicule> voitures = new ArrayList<Vehicule> ();
	 
	 
	 /**Cette methode rajoute des vehicules au garage.
	 * @param vehicule valeur Vehicule.
	 */
	public void addVoiture(Vehicule vehicule) {
			this.voitures.add(vehicule);
			
			
		}
	
	 
	 /**Cette methode génère l'affichage du contenu du garage.
	  * Soit dans la console, soit dans le fichier txt.
	 * @param writer valeur Writer
	 */
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
