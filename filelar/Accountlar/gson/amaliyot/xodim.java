package filelar.Accountlar.gson.amaliyot;

public class xodim {
    private int id;
    private String name;
    private String username;
    private String email;
    private adress adress;
    private String phone;
    private String website;
    private company company;

    public xodim(int id, String name, String username, String email, filelar.Accountlar.gson.amaliyot.adress adress, String phone, String website, filelar.Accountlar.gson.amaliyot.company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
}
