package Person;
import Exception.GrowthLimitException;

public class Leon extends Animal {
    public Leon(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 100);
    }

    @Override
    public void makeSound() {
        System.out.println("Лев издает звук: 'Ррррр!'");
    }

    @Override
    public String toString() {
        return "Leon{" +
                ", name='" + name + '\'' +
                ", isFriendly=" + isFriendly +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
