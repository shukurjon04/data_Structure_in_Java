package OOP.vorislik.hisob;

public class silindr extends circle {
    private Double height;
    public silindr(Double radius, Double color,Double height) {
        super(radius, color);
        this.height = height;

    }

    public Double getHeight() {
        return height;
    }
    public Double getvolume(){
        return super.getarea()*getHeight();
    }

    @Override
    public Double getarea() {
        return super.getarea()*2 + (getHeight()*2*Math.PI*super.getRadius());
    }

    @Override
    public String toString() {
        return "silindr{" +
                "volume=" + getvolume() +
                "\tarea=" + getarea()+
                '}';
    }
}
