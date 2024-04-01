package behavioural.visitorPattern.elements;

import behavioural.visitorPattern.visitors.DiscountVisitor;

public class Clothing implements Product{

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visitClothing(this);
    }
    
}
