package Person;
import Exception.GrowthLimitException;

public class Elephant extends Animal {
    public Elephant(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 400);
    }

    @Override
    public void makeSound() {
        System.out.println("Слон издает звук: 'Туууу!'");
    }

    @Override
    public String toString() {
        return "Elephant{" +
                ", isFriendly=" + isFriendly +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
