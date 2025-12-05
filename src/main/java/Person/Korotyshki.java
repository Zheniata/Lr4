package Person;

import Location.Place;
import java.util.Objects;

abstract public class Korotyshki extends livingCreatures {
    public abstract void act();
    protected Place currentPlace;
    public void goTo(Place p){
        this.currentPlace = p;
    }
    public void talkTo(Korotyshki k) {
        System.out.println(this + " разговариевает с " + k);
    }
    public void whatMood() {
        System.out.println("У " + this + " " + getCurrentMood() + " настроение");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Korotyshki that = (Korotyshki) obj;
        return Objects.equals(this.getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}
