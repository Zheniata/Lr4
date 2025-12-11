package Person;
import Exception.GrowthLimitException;

public class Leon extends Animal {
    public Leon(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 100);
    }

    @Override
    public String toString(){
        return "Лев";
    }
}
