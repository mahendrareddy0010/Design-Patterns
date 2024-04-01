package behavioural.visitorPattern.visitors;

import behavioural.visitorPattern.elements.Clothing;
import behavioural.visitorPattern.elements.Electronics;
import behavioural.visitorPattern.elements.Food;

public class FlashSaleDiscountVisitor implements DiscountVisitor {
 
    @Override
    public void visitFood(Food food) {
        System.out.println("Applyting Flash Sale Discount on Food");
    }

    @Override
    public void visitClothing(Clothing clothing) {
        System.out.println("Applyting Flash Sale Discount on Clothing");
    }

    @Override
    public void visitElectronics(Electronics electronics) {
        System.out.println("Applyting Flash Sale Discount on Electronics");
    }
    
}
