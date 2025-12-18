package Person;
import Enum.Mood;

public final class Klepka extends Korotyshki {
    @Override
    public void act() {
        System.out.println("Готовит");
    }

    public Klepka(String name, Integer age, boolean isHungry, Mood mood){
        super(name, age, isHungry, mood);
    }

    @Override
    public String toString() {
        return "Klepka{" +
                "currentPlace=" + currentPlace +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
