package Location;
import Record.PlaceInfo;

public class Shed extends Place{
    String name;
    private boolean isOpen;
    private PlaceInfo info;

    public Shed (PlaceInfo info) {
        this.info = info;
    }

    public Shed(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    public boolean isDoorOpen() {
        return isOpen;
    }

    public String isOpen() {
        if (isOpen) {
            return "Дверь сарайчика открыта";
        } else {
            return "Дверь сарайчика закрыта";
        }
    }
}
