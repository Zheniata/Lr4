package Location;

import Person.Animal;

import java.util.Objects;


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
            animal.makeSound();
        } else {
            System.out.println("Коротышки находят пустой вольер");
        }
    }

    @Override
    public String toString() {
        return "Enclosure{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Enclosure enclosure = (Enclosure) o;
        return Objects.equals(animal, enclosure.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), animal);
    }
}


