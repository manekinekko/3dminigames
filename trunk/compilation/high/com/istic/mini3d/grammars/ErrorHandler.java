package com.istic.mini3d.grammars;

import com.istic.mini3d.lib.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestionnaire d'erreurs.
 * @author Mini3D
 * @version 1.0
 */
public class ErrorHandler {

    /**
     * Type énuméré ErrorType.
     * Il défini le niveau de l'erreur.
     */
    public static enum ErrorType{
	/**
	 * Type WARNING.
	 * Il est utilisé pour attirer l'attention de l'utilisateur sur une incertitude ou sur un comportement non désirable.
	 */
	WARNING,
	/**
	 * Type ERROR.
	 * Il est utilisé pour les erreurs communes, mais qui ne nécessite pas un arrêt du compilateur.
	 */
	ERROR,
	/**
	 * Type FATAL.
	 * Il est utilisé dès qu'une erreur empêchant le compilateur de s'exécuter normalement est détectée.
	 */
	FATAL};
    private List<Pair<Integer, String>> errors;
    private static ErrorHandler instance;

    private ErrorHandler() {
        this.errors = new ArrayList<Pair<Integer, String>>();
    }

    /**
     * Patern Singleton.
     * Retourne l'unique instance du Gestionnaire d'erreur.
     * @return ErrorHandler instance.
     */
    public static ErrorHandler getInstance() {
        if(instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

    /**
     * Ajoute une erreur à la liste. Si l'erreur est FATAL, elle arrête le compilateur et affiche les erreurs.
     * @param type Type de l'erreur.
     * @param line Ligne où l'erreur est intervenue.
     * @param msg Message de l'erreur.
     */
    public void add(ErrorType type, int line, String msg) {
        switch(type) {
            case WARNING:
                this.warning(line, msg);
                break;
            case ERROR:
                this.error(line, msg);
                break;
            case FATAL:
                this.fatal(line, msg);
                break;
            default:
                this.stop("Erreur Inconnue");
        }
    }

    private void warning(int line, String msg) {
        String message = "WARNING : "+msg;
        Pair<Integer, String> p = new Pair<Integer, String>(line, message);
        this.errors.add(p);
    }
    private void error(int line, String msg) {
        String message = "ERROR : "+msg;
        Pair<Integer, String> p = new Pair<Integer, String>(line, message);
        this.errors.add(p);
    }
    private void fatal(int line, String msg) {
        String message = "FATAL ERROR : "+msg;
        Pair<Integer, String> p = new Pair<Integer, String>(line, message);
        this.errors.add(p);
        this.stop();
    }

    private void stop() {
        this.stop(null);
    }

    private void stop(String msg) {
        if(msg != null)
            System.out.println(msg);
        else
            printErrors();
        System.exit(-1);
    }

    /**
     * Affiche les erreurs.
     */
    public void printErrors() {
        for(Pair<Integer, String> p : this.errors) {
            System.out.println(p.getFirst());
            System.out.println(p.getSecond());
        }
    }
}
