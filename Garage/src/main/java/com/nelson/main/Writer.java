package com.nelson.main;

/**Cette interface d�finit le processus d'impl�mentation 
 * du fichier d'affichage.
 * @author moise
 *
 */
public interface Writer {
	
	/**
	 * Cette methode d�marre le processus de cr�ation du fichier
	 */
	public void start();
	
	
	/**Cette methode collecte les donn�es � ajouter au fichier
	 * @param line valeur String
	 */
	public void writeLine(String line);
	
	
	/**
	 * Cette methode clos le processus
	 */
	public void stop();
}

