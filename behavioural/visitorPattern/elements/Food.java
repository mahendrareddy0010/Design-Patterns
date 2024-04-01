package behavioural.visitorPattern.elements;

import behavioural.visitorPattern.visitors.DiscountVisitor;

public class Food implements Product{

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visitFood(this);
    }
    
}
