package Object;

public class Salad extends Dish{

    public Salad(String name, Integer price, boolean isDelicious){
        super(name, price, isDelicious);
    }

    @Override
    public String ingredients() {
        return ", состоящий из огурцов и помидоров";
    }

    @Override
    public String toString(){
        return "Салат";
    }
}
