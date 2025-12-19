package Person;

import Enum.Mood;
import Interface.MoodState;

abstract public class livingCreatures implements MoodState {
    public String name;
    int age;
    boolean isHungry;
    Mood mood;

    public String getCurrentMood(){
        String strMood = "";
        if (mood == Mood.good){
             strMood = "хорошее";
        }
        if (mood == Mood.happy){
            strMood = "веселое";
        }
        if (mood == Mood.bad){
            strMood = "плохое";
        }
        if (mood == Mood.sad){
            strMood = "грустное";
        }
        return strMood;
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
