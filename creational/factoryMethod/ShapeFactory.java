package creational.factoryMethod;

public class ShapeFactory {
    public static Shape getShape(String shapeName) {
        if ("Square".equalsIgnoreCase(shapeName)) {
            return new Square();
        } else if ("Rectangle".equalsIgnoreCase(shapeName)) {
            return new Rectangle();
        } else if ("Triangle".equalsIgnoreCase(shapeName)) {
            return new Triangle();
        } else if ("Pentagon".equalsIgnoreCase(shapeName)) {
            return new Pentagon();
        }

        return null;
    }
}
