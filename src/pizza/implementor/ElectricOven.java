package pizza.implementor;
//concrete implementor oven
public class ElectricOven implements Oven{
    @Override
    public String name(){
        return "Electric oven";
    }

    @Override
    public void heatTo(int temperature){
        System.out.println("    [electric] Heating elements are on, target \" + temperature + \"°C");
    }

    @Override
    public void bake(String dishName, int minutes){
        System.out.println("    [electric] Baking \" + dishName + \" with even heat for \" + minutes + \" min");
    }
}
