package Person;
import Exception.GrowthLimitException;

public class Zebra extends Animal {
    public Zebra(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 100);
    }

    @Override
    public String toString(){
        return "Зебра";
    }
}
