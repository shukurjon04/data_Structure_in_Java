package OOP.abstract1.shape;

public class circle extends shape {

    public circle(Double radius) {
        super(radius);
    }

    @Override
    public void peremeetr() {
        System.out.println(2 * Math.PI * getA());
    }

    @Override
    public void area() {
        System.out.println(Math.PI * Math.pow(2, getA()));
    }
}
