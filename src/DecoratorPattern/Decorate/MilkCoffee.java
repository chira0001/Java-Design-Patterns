package DecoratorPattern.Decorate;

import DecoratorPattern.Coffee;
import DecoratorPattern.CoffeeDecorator;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
