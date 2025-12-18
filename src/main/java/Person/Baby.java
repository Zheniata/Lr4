package Person;
import Enum.Mood;

public final class Baby extends Korotyshki {
    @Override
    public void act() {
        System.out.println("Малышка выметает мусор из сарая");
    }

    public Baby(String name, Integer age, boolean isHungry, Mood mood){
        super(name, age, isHungry, mood);
    }

    @Override
    public String toString() {
        return "Baby{" +
                "currentPlace=" + currentPlace +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                ", mood=" + mood +
                '}';
    }
}
