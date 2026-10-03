package pizza.abstraction;

import pizza.implementor.Oven;
//refined abstractiongi
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(Oven oven) {
        super(oven);
    }

    @Override
    protected String pizzaName() {
        return "Pepperoni";
    }

    @Override
    protected int temperature() {
        return 220;
    }

    @Override
    protected int bakingMinutes() {
        return 12;
    }
}