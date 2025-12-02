package Person;

import Exception.GrowthLimitException;

public abstract class Animal extends livingCreatures {
    String name;
    boolean isFriendly;
    private int currentSize;
    private final int maxGrowth;

    public abstract int getMaxGrowth();

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

}
