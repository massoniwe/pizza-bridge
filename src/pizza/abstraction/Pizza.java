package pizza.abstraction;
import pizza.implementor.Oven;
import java.util.Objects;

// abstraction

public abstract class Pizza {
    private Oven oven;

    protected Pizza(Oven oven) {
        this.oven = Objects.requireNonNull(oven, "oven");
    }

    public void switchOven(Oven newOven){
        this.oven = Objects.requireNonNull(oven,"oven");
    }
    protected abstract String pizzaName();

    protected abstract int temperature();

    protected abstract int bakingMinutes();

    public void cook() {
        System.out.println("Cooking "+pizzaName()+" in "+oven.name());
        oven.heatTo(temperature());
        oven.bake(pizzaName(),bakingMinutes());
    }


}
