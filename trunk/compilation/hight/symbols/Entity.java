package symbols;

import attributes.AttributeValue;
import java.util.*;

/**
 *
 * @author Quentin
 */
public class Entity implements Symbol {

    private String name;
    /*private*/ public List<Model> models;
    /*private*/ public Map<String, AttributeValue> attributes;
    private boolean duplicable = false;
    private int generate = 0;

    public Entity(String name, Model... m) {
        this.name = name;
        this.models = new ArrayList<Model>();
        this.attributes = new HashMap<String, AttributeValue>();
        this.models.addAll(Arrays.asList(m));
    }

    public void addAttribute(String attr, AttributeValue value) {
        this.attributes.put(attr, value);
    }

    public AttributeValue getAttribute(String n) {
        if (this.attributes.containsKey(n)) {
            return this.attributes.get(n);
        } else {
            Iterator<Model> it = this.models.iterator();
            while (it.hasNext()) {
                Model m = it.next();
                if (m.contains(n)) {
                    return m.getAttribute(n);
                }
            }

            return null;
        }
    }

    public List<String> listAttributes() {
        List<String> res = new ArrayList<String>();

        Iterator<Model> it = this.models.iterator();
        while (it.hasNext()) {
            Model m = it.next();
            res.addAll(m.listAttributes());
        }

        String[] tab = (String[]) this.attributes.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));

        return res;
    }

    public List<String> listModifyAttributes() {
        List<String> res = new ArrayList<String>();

        String[] tab = (String[]) this.attributes.keySet().toArray(new String[0]);
        res.addAll(Arrays.asList(tab));

        return res;
    }

    public List<Model> listModels() {
        List<Model> ret = new ArrayList<Model>(models);
        return ret;
    }

    public String getName() {
        return this.name;
    }

    public void setDuplicable() {
        duplicable = true;
    }

    public boolean getDuplicable() {
        return duplicable;
    }

    public void toGenerate() {
        generate++;;
    }

    public int getGenerate() {
        return generate;
    }

    public Type getType() {
	return Type.ENTITY;
    }
}
