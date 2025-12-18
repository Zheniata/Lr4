package Object;

public class Soup extends Dish{

    public Soup(String name, Integer price, boolean isDelicious){
        super(name, price, isDelicious);
    }

    @Override
    public String ingredients() {
        return ", состоящий из бульона и лапши";
    }

    @Override
    public String toString() {
        return "Soup{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isDelicious=" + isDelicious +
                '}';
    }
}
