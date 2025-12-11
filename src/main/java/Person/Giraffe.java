package Person;
import Exception.GrowthLimitException;

public class Giraffe extends Animal{
    public Giraffe(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 400);
    }

    @Override
    public String toString(){
        return "Жираф";
    }

}
