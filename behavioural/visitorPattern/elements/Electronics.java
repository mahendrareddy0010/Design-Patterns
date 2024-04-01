package behavioural.visitorPattern.elements;

import behavioural.visitorPattern.visitors.DiscountVisitor;

public class Electronics implements Product{

    @Override
    public void accept(DiscountVisitor discountVisitor) {
        discountVisitor.visitElectronics(this);
    }
    
}
