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

        Korotyshki neznaika = new Neznaika();
        neznaika.setName("Незнайка");
        neznaika.setHungry(true);
        neznaika.setMood(Mood.хорошее);

        Korotyshki klepka = new Klepka();
        klepka.setName("Клепка");
        klepka.setHungry(true);
        klepka.setMood(Mood.веселое);

        Korotyshki baby = new Baby();
        baby.setName("Малышка");

        neznaika.talkTo(klepka);
        neznaika.whatMood();
        klepka.whatMood();

        Canteen canteen = new Canteen();
        canteen.setName("Столовая");
        Dish salad = new Salad();
        salad.setName("Салат");
        salad.setDelicious(true);
        Dish tea = new Tea();
        tea.setName("Чай");
        tea.setDelicious(false);
        Dish soup = new Soup();
        soup.setName("Суп");
        soup.setDelicious(false);
        canteen.addFood(salad);
        canteen.addFood(tea);
        canteen.addFood(soup);


        if (neznaika.isHungry() || klepka.isHungry()) {
            System.out.println(neznaika + " и " + klepka + " отправляются в столовую");
            neznaika.goTo(canteen);
            klepka.goTo(canteen);
            Korotyshki[] korotyshki = {neznaika, klepka};

            canteen.serveFood(korotyshki);
        }
        else {
            System.out.println(neznaika + " и " + klepka + " не голодны");
        }

        Place zoo = new Zoo();
        zoo.setName("зоопарк");

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
        Enclosure enclosure1 = new Enclosure();
        enclosure1.addAnimal(leon);
        Enclosure enclosure2 = new Enclosure();
        enclosure2.addAnimal(zebra);
        Enclosure enclosure3 = new Enclosure();
        enclosure3.addAnimal(elephant);
        Enclosure enclosure4 = new Enclosure();
        enclosure4.addAnimal(giraffe);
        Enclosure enclosure5 = new Enclosure();
        enclosure5.addAnimal(giraffe);

        List<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(enclosure1);
        enclosures.add(enclosure2);
        enclosures.add(enclosure3);
        enclosures.add(enclosure4);

        neznaika.goTo(zoo);
        klepka.goTo(zoo);
        System.out.println(neznaika.getName() + " и " + klepka.getName() + " отправляются в " + zoo.getName());
        System.out.println("Путешественники начинают бродить по зоопарку, заглядывая во все уголки");

        Random random = new Random();
        int numEnclosures = random.nextInt(4) + 1;
        for (int i = 0; i < numEnclosures; i++) {
            enclosures.get(i).whoInEnclosure();
        }
        Shed shed = new Shed(true);
        PlaceInfo shedInfo = new PlaceInfo("сарайчику", "маленькому");

        System.out.println("Обойдя всё вокруг, коротышки отправляются к " + shedInfo.size() + " " +shedInfo.name());
        neznaika.goTo(shed);
        klepka.goTo(shed);

        System.out.println(shed.isOpen());
        if (shed.isDoorOpen()){
            System.out.println(neznaika.getName() + " и " + klepka.getName() + " встречают " + baby.getName());
            baby.act();
        }

    }
}
