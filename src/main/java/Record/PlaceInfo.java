package Record;

public record PlaceInfo(String name, String size, boolean isOpen) {
    @Override
    public String toString() {
        return "PlaceInfo{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
