package OOP.abstract1.shape;

public class rectangle extends shape{
    public rectangle(Double a) {
        super(a);
    }

    public rectangle(Double a, Double b) {
        super(a, b);
    }

    @Override
    public void peremeetr() {
        System.out.println(2*(getA()+getB()));
    }

    @Override
    public void area() {
        System.out.println(getA()*getB());
    }
}
