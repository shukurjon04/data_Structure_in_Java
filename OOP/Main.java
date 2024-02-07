package OOP;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.modeli ="nexia";
        car1.rangi = "kulrang";
        car1.tezligi = 150;
        System.out.println(car1.tezligi);
        System.out.println(car1.modeli);
        System.out.println(car1.rangi);
        car1.run();
    }
}
