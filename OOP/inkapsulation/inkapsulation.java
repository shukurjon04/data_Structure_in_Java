package OOP.inkapsulation;

public class inkapsulation {
    public static void main(String[] args) {
        developer developer = new developer();
        developer.age =25;
        developer.name = "shukurjon";
        developer.setExperiance(5);
        System.out.println("tajribasi: "+developer.getExperiance()+" yil");
        System.out.println(developer);
    }
}
