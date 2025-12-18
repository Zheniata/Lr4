package Person;
import Exception.GrowthLimitException;

public class Giraffe extends Animal{
    public Giraffe(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 400);
    }

    @Override
    public void makeSound() {
        System.out.println("Жираф издает звук: 'Му-у-у..'");
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", isFriendly=" + isFriendly +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
