package Person;

import Exception.GrowthLimitException;
import Location.Place;

import java.util.Objects;

public abstract class Animal extends livingCreatures {
    String name;
    boolean isFriendly;
    private int currentSize;
    private int maxGrowth;

    public int getMaxGrowth() {
        return maxGrowth;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public Animal(String name, int initialSize, int maxGrowth) throws GrowthLimitException {
        this.name = name;
        this.maxGrowth = maxGrowth;
        this.currentSize = 0;
        if (initialSize > getMaxGrowth()) {
            this.currentSize = getMaxGrowth();
            throw new GrowthLimitException(
                    name + " создан с размером " + initialSize + ", это превышает предел (" + getMaxGrowth() + "). " + "исправляем на " + getMaxGrowth()
            );
        } else {
            this.currentSize = initialSize;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal that = (Animal) obj;
        return Objects.equals(this.getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}
