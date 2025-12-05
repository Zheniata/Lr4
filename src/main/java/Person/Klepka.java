package Person;

public final class Klepka extends Korotyshki {
    @Override
    public void act() {
        System.out.println("Готовит");
    }

    @Override
    public String toString() {
        return "Клепка";
    }
}
