/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.istic.mini3d.grammars;

import com.istic.mini3d.lib.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quentin
 */
public class ErrorHandler {

    public static enum ErrorType{WARNING, ERROR, FATAL};
    private List<Pair<Integer, String>> errors;
    private static ErrorHandler instance;

    private ErrorHandler() {
        this.errors = new ArrayList<Pair<Integer, String>>();
    }

    public static ErrorHandler getInstance() {
        if(instance == null) {
            instance = new ErrorHandler();
        }
        return instance;
    }

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

    public void printErrors() {
        for(Pair<Integer, String> p : this.errors) {
            System.out.println(p.getFirst());
            System.out.println(p.getSecond());
        }
    }
}
