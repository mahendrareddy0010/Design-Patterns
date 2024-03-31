package creational.prototype;

import java.util.ArrayList;

public class BasicCar extends Car {

    public BasicCar() {
        model = new ArrayList<>();
        model.add("model 1");
        model.add("model 2");
        color = "simple";
    }

    @Override
    public void customize(String color, String accessories) {
        this.color = color;
        this.model.add(color);
        System.out.println("Color: " + color + " accessories: " + accessories);
    }
    
}
