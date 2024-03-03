package filelar.Accountlar.gson.amaliyot;

public class adress {
    private String Street;
    private String suite;
    private String city;
    private String zipcode;
    private geo geo;

    public adress(String street, String suite, String city, String zipcode, geo geo) {
        Street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }
}
