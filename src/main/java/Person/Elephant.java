package Person;
import Exception.GrowthLimitException;

public class Elephant extends Animal {
    public Elephant(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 400);
    }

    @Override
    public int getMaxGrowth(){
        return 400;
    }
}
