package OOP.modifikation;

public class person {
    private String id;
    private String username;
    private String email;
    private adress adress;

    public person(String id, String username, String email, OOP.modifikation.adress adress) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "person{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                '}';
    }
}
