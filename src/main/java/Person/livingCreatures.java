package Person;

import Enum.Mood;
import Interface.MoodState;

abstract public class livingCreatures implements MoodState {
    public String name;
    Integer age;
    boolean isHungry;
    Mood mood;

    public String getCurrentMood(){
        return mood.toString();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

}
