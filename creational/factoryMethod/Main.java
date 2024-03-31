package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape("Square");
        Shape rectangle = ShapeFactory.getShape("Rectangle");
        Shape triangle = ShapeFactory.getShape("triangle");
        Shape pentagon = ShapeFactory.getShape("pentagon");

        square.draw();
        rectangle.draw();
        triangle.draw();
        pentagon.draw();
        
    }
}
