package behavioural.visitorPattern;

import behavioural.visitorPattern.elements.Clothing;
import behavioural.visitorPattern.elements.Electronics;
import behavioural.visitorPattern.elements.Food;
import behavioural.visitorPattern.elements.Product;
import behavioural.visitorPattern.visitors.ClearanceSaleDiscountVisitor;
import behavioural.visitorPattern.visitors.DiscountVisitor;
import behavioural.visitorPattern.visitors.FlashSaleDiscountVisitor;
import behavioural.visitorPattern.visitors.HolidaySaleDiscountVisitor;

public class Main {
    public static void main(String[] args) {
        DiscountVisitor clearanceSaleDiscountVisitor = new ClearanceSaleDiscountVisitor();
        DiscountVisitor flashSaleDiscountVisitor = new FlashSaleDiscountVisitor();
        DiscountVisitor holidaySaleDiscountVisitor = new HolidaySaleDiscountVisitor();

        Product food = new Food();
        Product clothing = new Clothing();
        Product electronics = new Electronics();

        food.accept(holidaySaleDiscountVisitor);
        clothing.accept(clearanceSaleDiscountVisitor);
        electronics.accept(flashSaleDiscountVisitor);
    }
}
