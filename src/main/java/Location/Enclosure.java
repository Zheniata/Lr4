package Location;

import Person.Animal;


public class Enclosure extends Place {
    private Animal animal;

    public void addAnimal(Animal animal) {
        if (animal != null) {
            this.animal = animal;
        }
    }

    public Enclosure(Animal animal) {
        super(animal != null ? animal.getName() : "Пустой вольер");
        this.animal = animal;
    }


    public void whoInEnclosure() {
        if (animal != null && animal.getName() != null) {
            System.out.println("Коротышки находят вольер, в котором находится " + animal.getName());
        } else {
            System.out.println("Коротышки находят пустой вольер");
        }
    }
}


