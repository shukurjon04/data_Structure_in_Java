package OOP.modifikation;

public class main {

    public static void main(String[] args) {
        geo geo = new geo("-37.516","54984");
        adress adress = new adress("kulas light","apt.556","45464645-54",geo);
        person person = new person("1","shukurjon","boqiyev@gmail.com",adress);
        System.out.println(person);


    }


}
