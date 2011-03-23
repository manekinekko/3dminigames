/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package symbols;

import attributes.AttributeValue;

/**
 *
 * @author 10005030
 */
public class Control implements Symbol{

    public static enum Source  {CLAVIER,SOURIS}
    public static enum Mode {PRESSED,HELD,RELEASED}

    private String name;
    private Mode mode;
    private Source source;
    private Definition d;
    private String commande;
    
    
    public Control(String nom, Mode mo, Source sr, Definition de){
        name = "3_"+nom;
        mode = mo;
        source = sr;
        d = de;
        commande = nom;
    }
    
    public Control(String nom, Source sr,Definition de){
        name = "3_"+nom;
        mode = Mode.HELD;
        source = sr;
        d = de;
        commande = nom;
    }

    public String getName() {
        return name;
    }

    public Mode getMode(){
        return mode;
    }

    public Source getSource(){
        return source;
    }

    public Definition getDefinition(){
        return d;
    }

    public String getCommance(){
        return commande;
    }


    public AttributeValue getAttribute(String n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addAttribute(String attr, AttributeValue value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void toGenerate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getGenerate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Type getType() {
        return Type.CONTROL;
    }

}
