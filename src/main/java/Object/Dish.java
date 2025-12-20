package Object;

import Interface.Taste;
import Person.Korotyshki;

import java.util.Objects;

public abstract class Dish implements Taste {
    String name;
    Integer price;
    boolean isDelicious;

    public Dish(String name, Integer price, boolean isDelicious) {
        this.name = name;
        this.price = price;
        this.isDelicious = isDelicious;
    }

    public String getTaste(){
        if (isDelicious){
            return "Вкусно";
        }
        else {
            return "Невкусно";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String isDelicious() {
        if (isDelicious){
            return "вкусный";
        }
        else{
            return "невкусный";
        }
    }

    public void setDelicious(boolean delicious) {
        isDelicious = delicious;
    }

    public String ingredients(){
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dish that = (Dish) obj;
        return Objects.equals(this.getName(), that.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
