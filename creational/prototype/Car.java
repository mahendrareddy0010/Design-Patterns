package creational.prototype;

import java.util.List;

public abstract class Car implements Cloneable {
    protected List<String> model;
    protected String color;

    public abstract void customize(String color, String accesaries);

    @Override
    public Object clone() {
        Object clone;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + "]";
    }
}
