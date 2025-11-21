package Person;

import Location.Place;

abstract public class Korotyshki extends livingCreatures {
    public abstract void act();
    protected Place currentPlace;
    public void goTo(Place p){
        this.currentPlace = p;
    }
    public void talkTo(Korotyshki k) {
        System.out.println(this.getName() + " разговариевает с " + k.getName());
    }
    public void whatMood() {
        System.out.println("У " + this.getName() + " " + getCurrentMood() + " настроение");
    }

}
