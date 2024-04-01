package behavioural.visitorPattern.elements;

import behavioural.visitorPattern.visitors.DiscountVisitor;

public interface Product {
    public void accept(DiscountVisitor discountVisitor);
}
