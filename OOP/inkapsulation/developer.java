package OOP.inkapsulation;

public class developer {
    String name;
    public int age;
    private int experiance;
    public developer(){

    }
    public developer(String name,int age, int experiance){
        this.name=name;
        this.age=age;
        this.experiance=experiance;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    @Override
    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experiance=" + experiance +
                '}';
    }
}
