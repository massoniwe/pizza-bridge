package pizza.implementor;
// implementor oven
public interface Oven {
    String name();

    void heatTo(int temperature);

    void bake(String dishName, int minutes);
}
