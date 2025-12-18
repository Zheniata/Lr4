package Object;

public class Tea extends Dish{

    public Tea(String name, Integer price, boolean isDelicious){
        super(name, price, isDelicious);
    }

    @Override
    public String ingredients() {
        return ", состоящий из кипетка и заварки";
    }

    @Override
    public String toString() {
        return "Tea{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isDelicious=" + isDelicious +
                '}';
    }
}
