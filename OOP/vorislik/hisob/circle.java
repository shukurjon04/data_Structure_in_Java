package OOP.vorislik.hisob;

public class circle {
    private Double radius;
    private Double color;

    public circle(Double radius, Double color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public Double getColor() {
        return color;
    }
    public Double getarea(){
        return 2*Math.PI*Math.pow(2,radius);
    }

    @Override
    public String toString() {
        return "circle{" +
                "area=" + getarea() + '}';
    }
}
