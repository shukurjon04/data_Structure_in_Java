package OOP.modifikation;

public class adress {
     private String street;
     private String suite;
     private String zipcode;
     private geo geo;

    public adress(String street, String suite, String zipcode, OOP.modifikation.geo geo) {
        this.street = street;
        this.suite = suite;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    @Override
    public String toString() {
        return "adress{" +
                "street='" + street + '\'' +
                ", suite='" + suite + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
