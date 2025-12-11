package Record;

public record PlaceInfo(String name, String size, boolean b) {
    @Override
    public String toString() {
        return "PlaceInfo{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
