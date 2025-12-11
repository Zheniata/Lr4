package Location;
import Record.PlaceInfo;

public class Shed extends Place{
    private boolean isOpen;
    private PlaceInfo info;

    public Shed(String name, PlaceInfo info, boolean isOpen) {
        super(name);
        this.info = info;
        this.isOpen = isOpen;
    }

    public Shed(PlaceInfo info, boolean isOpen) {
        super(info.name());            // ← передаём имя из record в родительский класс Place
        this.info = info;
        this.isOpen = isOpen;
    }

    public Shed(PlaceInfo info) {
        this(info, false); // вызываем основной конструктор с isOpen = false
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
