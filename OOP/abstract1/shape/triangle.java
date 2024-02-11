package OOP.abstract1.shape;

public class triangle extends shape {
    public triangle(Double a, Double b, Double c) {
        super(a, b, c);
    }

    @Override
    public void peremeetr() {
        System.out.println(getA() + getB() + getC());
    }

    @Override
    public void area() {
        double p = (getA() + getC() + getB()) / 2;
        System.out.println(Math.sqrt(p * (p - getB()) * (p - getC()) * (p - getA())));
    }
}
