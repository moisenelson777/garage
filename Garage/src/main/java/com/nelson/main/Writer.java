package com.nelson.main;

/**Cette interface définit le processus d'implémentation 
 * du fichier d'affichage.
 * @author moise
 *
 */
public interface Writer {
	
	/**
	 * Cette methode démarre le processus de création du fichier
	 */
	public void start();
	
	
	/**Cette methode collecte les données à ajouter au fichier
	 * @param line valeur String
	 */
	public void writeLine(String line);
	
	
	/**
	 * Cette methode clos le processus
	 */
	public void stop();
}

