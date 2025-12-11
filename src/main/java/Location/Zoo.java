package Location;

public class Zoo extends Place {
    public void addEnclosure(){}
    public Zoo(String name) {
        super(name);
    }

    @Override
    public String toString(){
        return "Зоопарк";
    }
}
