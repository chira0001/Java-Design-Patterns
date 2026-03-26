package DecoratorPattern;

import DecoratorPattern.Decorate.MilkCoffee;
import DecoratorPattern.Decorate.SugarCoffee;

public class Customer {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + ", Cost : " + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkCoffee(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + ", Cost : " + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarCoffee(new MilkCoffee(new SimpleCoffee()));
        System.out.println(sugarCoffee.getDescription() + ", Cost : " + sugarCoffee.getCost());
    }
}
