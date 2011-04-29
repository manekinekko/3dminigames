package com.istic.mini3d.attributes;

import com.istic.mini3d.code.Code;
import com.istic.mini3d.symbols.Entity;
import com.istic.mini3d.symbols.Model;
import java.util.Iterator;
import java.util.List;

public class Array {
    private Model type;
    private List<Entity> list;

    public Array(Model type) {
	this.type = type;
    }

    public boolean add(Entity e) {
	if(e.listModels().contains(this.type))
	    this.list.add(e);
	else
	    return false;
	return true;
    }

    public void remove(Entity e) {
	list.remove(e);
    }

    public void remove(int i) {
	list.remove(i);
    }

    public Code getCode() {
	Code c = new Code();
	c.append("new Array(");
	Iterator<Entity> it = this.list.iterator();
	while(it.hasNext()) {
	    Entity ent = it.next();
	    c.append(ent.getName()+", ");
	}
	c.append(");");

	return c;
    }
}
