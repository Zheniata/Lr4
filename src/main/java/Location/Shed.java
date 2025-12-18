package Location;
import Record.PlaceInfo;

public class Shed extends Place {
    private final PlaceInfo info;

    public Shed(PlaceInfo info) {
        super(info.name());
        this.info = info;
    }

    public boolean isOpen() {
        return info.isOpen();
    }

    public String isOpenMessage() {
        return isOpen() ? "Дверь сарайчика открыта" : "Дверь сарайчика закрыта";
    }

    @Override
    public String toString() {
        return info.name() + (isOpen() ? "открыт" : "закрыт");
    }
}