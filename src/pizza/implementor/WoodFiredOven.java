package pizza.implementor;
// concrete implementor oven
public class WoodFiredOven implements Oven{
    @Override
    public String name(){
        return "Wood Fired Oven";
    }
    @Override
    public void heatTo(int temperature){
        System.out.println("    [wood] Adding logs, fire is heating up to " + temperature + "°C");
    }

    @Override
    public void bake(String dishName, int minutes){
        System.out.println("    [wood] Baking " + dishName + " on open fire for " + minutes + " min");
    }
}
