package Location;
import Record.PlaceInfo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shed shed = (Shed) o;
        return Objects.equals(info, shed.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), info);
    }
}