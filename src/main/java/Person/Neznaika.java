package Person;
import Enum.Mood;

public final class Neznaika extends Korotyshki {
    @Override
    public void act() {
        System.out.println("Иследует мир");
    }

    public Neznaika(String name, Integer age, boolean isHungry, Mood mood){
        super(name, age, isHungry, mood);
    }

    @Override
    public String toString() {
        return "Neznaika{" +
                "currentPlace=" + currentPlace +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
