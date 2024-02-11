package OOP.innerclass;

public class Car {
    dvigatel start(){
        dvigatel dvigatel = new dvigatel();
         return dvigatel;
    }
    public class dvigatel{
        dvigatel(){
            System.out.println("dvigatel yurishga tayyor.....");
        }

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
