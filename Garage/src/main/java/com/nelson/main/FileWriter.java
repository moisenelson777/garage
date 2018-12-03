package com.nelson.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**Cette classe génère le fichier d'affichage.
 * @author moise
 *
 */
public class FileWriter implements Writer {

	/**
	 * String nom du fichier à créer
	 */
	private String filename;
	/**
	 * Path transmetteur au repertoire
	 */
	private Path path;
	
	/**
	 * String contenu du fichier
	 */
	private String content;
	
	
	/**Cette methode recoit le nom à attribuer au fichier
	 * @param filename valeur String
	 */
	public FileWriter(String filename) {
        this.filename = filename;
    }

    /* (non-Javadoc)
     * @see com.nelson.main.Writer#start()
     */
    @Override
    public void start() {
        path = Paths.get(filename);
        content = "";
    }

    /* (non-Javadoc)
     * @see com.nelson.main.Writer#writeLine(java.lang.String)
     */
    @Override
    public void writeLine(String line) {
        content += line + "%n";
    }

    /* (non-Javadoc)
     * @see com.nelson.main.Writer#stop()
     */
    @Override
    public void stop() {
        try {
            Files.write(path, String.format(content).getBytes());
        } catch (IOException e) {
            System.err.println("Impossible d'afficher le garage");
        }
    }
}