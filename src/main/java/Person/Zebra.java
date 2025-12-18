package Person;
import Exception.GrowthLimitException;

public class Zebra extends Animal {
    public Zebra(String name, int initialSize) throws GrowthLimitException {
        super(name, initialSize, 100);
    }

    @Override
    public void makeSound() {
        System.out.println("Зебра издает звук: 'И-го-го!'");
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "isFriendly=" + isFriendly +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
