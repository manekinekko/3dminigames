
import java.util.*;


public class Type {

    private String name;
    private List<String> attributs;


    public Type(String name){
        this.name = name;
        attributs = new ArrayList<String>();
    }

    public Type(String name, String ... attr){
        this.name = name;
        attributs = new ArrayList<String>();
        for (int i = 0; i < attr.length; i++) {
            attributs.add(attr[i]);
        }

    }

    public final void addAttribut(String attr){
        this.attributs.add(attr);
    }
	
	public final List<String> getAttribut() {
		return attributs.clone();
	}


    public final boolean exist(String attr){
        return attributs.contains(attr);
    }

    public final String getName(){
        return name;
    }
    
}
