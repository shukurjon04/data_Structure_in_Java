package OOP.abstract1.shape;

public abstract class shape {
    private Double a;
    private Double b;
    private Double c;

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public shape() {
    }

    public shape(Double a) {
        this.a = a;
    }

    public shape(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public shape(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract void peremeetr();

    public abstract void area();
}
