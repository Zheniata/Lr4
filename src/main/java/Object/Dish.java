package Object;

import Interface.Taste;

public class Dish implements Taste {
    String name;
    Integer price;
    boolean isDelicious;
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
}
