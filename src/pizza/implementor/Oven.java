package pizza.implementor;
// implementor
public interface Oven {
    String name();

    void heatTo(int temperature);

    void bake(String dishName, int minutes);
}
