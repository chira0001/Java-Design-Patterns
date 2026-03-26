package DecoratorPattern.Decorate;

import DecoratorPattern.Coffee;
import DecoratorPattern.CoffeeDecorator;

public class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
