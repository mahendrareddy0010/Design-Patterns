package behavioural.visitorPattern.visitors;

import behavioural.visitorPattern.elements.Clothing;
import behavioural.visitorPattern.elements.Electronics;
import behavioural.visitorPattern.elements.Food;

public interface DiscountVisitor {
    public void visitFood(Food food);
    public void visitClothing(Clothing clothing);
    public void visitElectronics(Electronics electronics);
}
