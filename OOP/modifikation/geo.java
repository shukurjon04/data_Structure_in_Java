package OOP.modifikation;

public class geo {
    private String lat;
    private String ing;

    public geo(String lat, String ing) {
        this.lat = lat;
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "geo{" +
                "lat='" + lat + '\'' +
                ", ing='" + ing + '\'' +
                '}';
    }
}
