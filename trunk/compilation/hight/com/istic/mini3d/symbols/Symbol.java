package com.istic.mini3d.symbols;

import com.istic.mini3d.attributes.AttributeValue;

public interface Symbol {
    public static enum Type{DEFINITION, ENTITY, MODEL, CONTROL};
    public String getName();
    public AttributeValue getAttribute(String n);
    public void addAttribute(String attr, AttributeValue value);
    public void toGenerate();
    public int getGenerate();
    public Type getType();
}
