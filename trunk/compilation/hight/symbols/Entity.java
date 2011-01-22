
package symbols;

import attributes.Attributes;
import java.util.*;

/**
 *
 * @author Quentin
 */
public class Entity implements Symbol{

    private String name;
    private List<Model> models;
    private Map<String, Attributes> attributes;

    public Entity(String name, Model ... m) {
        this.name = name;
        this.models = new ArrayList<Model>();
        this.attributes = new HashMap<String, Attributes>();
        this.models.addAll(Arrays.asList(m));
    }

    public void addAttribute(String n, Attributes a) {
        this.attributes.put(n, a);
    }

    public Attributes getAttribute(String n) {
        if(this.attributes.containsKey(n))
            return this.attributes.get(n);
        else {
            Iterator<Model> it = this.models.iterator();
            while(it.hasNext()) {
                Model m = it.next();
                if(m.contains(n))
                    return m.getAttribute(n);
            }

            return null;
        }
    }

    public List<String> listAttributes() {
        List<String> res = new ArrayList<String>();

        Iterator<Model> it = this.models.iterator();
        while(it.hasNext()) {
            Model m = it.next();
            res.addAll(m.listAttributes());
        }

        String[] tab = (String[])this.attributes.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));

        return res;
    }

    public String getName() {
        return this.name;
    }
}
