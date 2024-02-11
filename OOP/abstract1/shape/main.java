package OOP.abstract1.shape;

public class main {
    public static void main(String[] args) {
        circle circle = new circle(10.0);
        circle.peremeetr();
        circle.area();

        triangle triangle = new triangle(5.0, 6.0, 7.0);
        triangle.peremeetr();
        triangle.area();

        rectangle rectangle = new rectangle(2.0,5.0);
        rectangle.peremeetr();
        rectangle.area();

        square square = new square(4.0);
        square.peremeetr();
        square.area();
    }
}
