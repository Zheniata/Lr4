package Location;

import Object.*;
import java.util.ArrayList;
import Person.Korotyshki;
import Exception.NoFoodException;

public class Canteen extends Place {
    private ArrayList<Dish> menu = new ArrayList<>();

    public void addFood(Dish d) {
        if (d != null) {
            menu.add(d);
        }
    }

    public ArrayList<Dish> getMenu() {
        return new ArrayList<>(menu);
    }
    public void serveFood(Korotyshki[] korotyshki) throws NoFoodException {
        if (korotyshki.length > menu.size()) {
            throw new NoFoodException();
        }

        for (int i = 0; i < korotyshki.length; i++) {
            System.out.println(korotyshki[i].getName() + " получает " + menu.get(i).isDelicious() + " " + menu.get(i).getName() + menu.get(i).ingredients());
        }
    }
}
