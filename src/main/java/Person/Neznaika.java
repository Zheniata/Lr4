package Person;

public final class Neznaika extends Korotyshki {
    @Override
    public void act() {
        System.out.println("Иследует мир");
    }

   @Override
    public String toString(){
        return "Незнайка";
   }
}
