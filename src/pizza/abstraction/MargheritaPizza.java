package pizza.abstraction;

import pizza.implementor.Oven;
// refined abstraction
public class MargheritaPizza extends Pizza {

    public MargheritaPizza(Oven oven) {
        super(oven);
    }

    @Override
    protected String pizzaName() {
        return "Margherita";
    }

    @Override
    protected int temperature() {
        return 450;
    }

    @Override
    protected int bakingMinutes() {
        return 7;
    }
}