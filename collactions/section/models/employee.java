package collactions.section.models;

public class employee extends Person{
    private section  section;
    private position position;
    private double salary;

    public employee(String name, String lastname, String patron, String birthday, char gender, section section, position position, double salary) {
        super(name, lastname, patron, birthday, gender);
        this.section = section;
        this.position = position;
        this.salary = salary;
    }

    public section getSection() {
        return section;
    }

    public void setSection(section section) {
        this.section = section;
    }

    public position getPosition() {
        return position;
    }

    public void setPosition(position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                super.toString()+
                "section=" + section +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
