package OOP.abstract1.shape;

public class square extends rectangle{
    public square(Double a) {
        super(a);
    }

    @Override
    public void peremeetr() {
        System.out.println(4*getA());
    }

    @Override
    public void area() {
        System.out.println(Math.pow(2,getA()));
    }
}
