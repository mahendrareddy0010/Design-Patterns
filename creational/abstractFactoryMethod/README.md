`Drinks`  ---------- CoffeeDrink
            ------ TeaDrink
`Pastries` ----------CoffeePastry
            -------TeaPastry
`Abstract Factory`  ------- getDrink()
                  ------- getPastry()
`CoffeeFactory`   ---------- getDrink() return new CoffeeDrink()  
               ---------- getPastry() return new CoffeePastry()  
`TeaFactory`   ---------- getDrink() return new TeaDrink()  
               ---------- getPastry() return new TeaPastry()

`Factory method vs Abstract Factory method:`
    1. Factory method ------- gives DrinksFactory class where it can give you object under this interface
    2. It's like giving objects of subtree under this interface.
    3. Abstract Factory Method -------- gives factories where each factory give one object from different interfaces (upper level) like one from Drinks and one from Pastries.
    4. It's like giving objects at same level across with different parents which are also at the same level.