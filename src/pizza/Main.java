package pizza;
import pizza.abstraction.MargheritaPizza;
import pizza.abstraction.PepperoniPizza;
import pizza.implementor.ElectricOven;
import pizza.implementor.WoodFiredOven;
import pizza.abstraction.Pizza;

// client

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new MargheritaPizza(new WoodFiredOven());
        margherita.cook();
        margherita.switchOven(new ElectricOven());
        margherita.cook();
        Pizza pepperoni = new PepperoniPizza(new ElectricOven());
        pepperoni.cook();
    }
}
