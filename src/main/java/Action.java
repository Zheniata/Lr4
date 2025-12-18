import Location.*;
import Object.*;
import Person.*;
import Record.PlaceInfo;
import Enum.Mood;
import Exception.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Action {
    public static void main (String[] args) throws GrowthLimitException {

        Korotyshki neznaika = new Neznaika("Незнайка", 11, true, Mood.хорошее);
        Korotyshki klepka = new Klepka("Клепка", 9, true, Mood.веселое);
        Korotyshki baby = new Baby("Малышка", 10, true, Mood.грустное);

        neznaika.talkTo(klepka);
        neznaika.whatMood();
        klepka.whatMood();

        Canteen canteen = new Canteen("Столовая");
        Dish salad = new Salad("Салат", 50, true);
        Dish tea = new Tea("Чай", 15, false);
        Dish soup = new Soup("Суп", 50, true);
        canteen.addFood(salad);
        canteen.addFood(tea);
        canteen.addFood(soup);


        if (neznaika.isHungry() || klepka.isHungry()) {
            System.out.println(neznaika.name + " и " + klepka.name + " отправляются в столовую");
            neznaika.goTo(canteen);
            klepka.goTo(canteen);
            Korotyshki[] korotyshki = {neznaika, klepka};

            canteen.serveFood(korotyshki);
        }
        else {
            System.out.println(neznaika + " и " + klepka + " не голодны");
        }

        Place zoo = new Zoo("зоопарк");

        Animal leon = null;
        try {
            leon = new Leon("Лев", 120);
        } catch (GrowthLimitException e) {
            System.err.println(e.getMessage());
        }
        Animal zebra = null;
        try {
            zebra = new Zebra("Зебра", 100);
        } catch (GrowthLimitException e) {
            System.err.println(e.getMessage());
        }
        Animal elephant = null;
        try {
            elephant = new Elephant("Слон", 300);
        } catch (GrowthLimitException e) {
            System.err.println(e.getMessage());
        }
        Animal giraffe = null;
        try {
            giraffe = new Giraffe("Жираф", 300);
        } catch (GrowthLimitException e) {
            System.err.println(e.getMessage());
        }
        Enclosure enclosure1 = new Enclosure(leon);
        Enclosure enclosure2 = new Enclosure(zebra);
        Enclosure enclosure3 = new Enclosure(elephant);
        Enclosure enclosure4 = new Enclosure(giraffe);
        Enclosure enclosure5 = new Enclosure(null);

        List<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(enclosure1);
        enclosures.add(enclosure2);
        enclosures.add(enclosure3);
        enclosures.add(enclosure4);
        enclosures.add(enclosure5);

        neznaika.goTo(zoo);
        klepka.goTo(zoo);
        System.out.println(neznaika.getName() + " и " + klepka.getName() + " отправляются в " + zoo.getName());
        System.out.println("Путешественники начинают бродить по зоопарку, заглядывая во все уголки");

        Random random = new Random();
        int numEnclosures = random.nextInt(4) + 1;
        for (int i = 0; i < numEnclosures; i++) {
            enclosures.get(i).whoInEnclosure();
        }

        PlaceInfo shedInfo = new PlaceInfo("Сарайчик", "маленький", true);
        Shed shed = new Shed(shedInfo);

        System.out.println("Обойдя всё вокруг, коротышки отправляются к сарайчкику");
        neznaika.goTo(shed);
        klepka.goTo(shed);

        System.out.println(shed.isOpenMessage());
        if (shed.isOpen()){
            System.out.println(neznaika.getName() + " и " + klepka.getName() + " встречают " + baby.getName());
            baby.act();
        }

    }
}


