package Location;

import Person.Korotyshki;

import java.util.Objects;

abstract public class Place {
    String name;
    Integer size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Place that = (Place) obj;
        return Objects.equals(this.getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public Place(String name) {
        this.name = name;
    }
}
