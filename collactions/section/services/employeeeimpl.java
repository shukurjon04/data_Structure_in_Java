package collactions.section.services;

import collactions.section.models.employee;
import collactions.section.models.position;
import collactions.section.models.section;

import java.util.List;
import java.util.Scanner;

public class employeeeimpl implements employeeeee {
    private List<employee> employeeList;
    private List<section> sectionList;
    private List<position> positionList;
    private Scanner in = new Scanner(System.in);

    public employeeeimpl(List<employee> employeeList, List<section> sectionList, List<position> positionList) {
        this.employeeList = employeeList;
        this.sectionList = sectionList;
        this.positionList = positionList;
    }

    @Override
    public void addemploye() {
        System.out.println(" first name : ");
        String name = in.next();
        System.out.println(" last name : ");
        String lastname = in.next();
        System.out.println(" patron : ");
        String patron = in.next();
        System.out.println(" birthday : ");
        String birthday = in.next();
        System.out.println(" gender : ");
        char gender = in.next().charAt(0);
        for (int i = 0; i < positionList.size(); i++) {
            System.out.println((i + 1) + " -> " + positionList.get(i).getName());
        }
        int n = in.nextInt() - 1;
        position position = positionList.get(n);
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i + 1) + " -> " + sectionList.get(i).getName());
        }
        int n1 = in.nextInt() - 1;
        section section = sectionList.get(n1);
        System.out.println(" salary : ");
        Double salary = in.nextDouble();
        employee employee =new employee(name,lastname,patron,birthday,gender,section,position,salary);
        employeeList.add(employee);
    }

    @Override
    public void deleteemploye() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + " -> " + employeeList.get(i).getName());
        }
//        int n = scanner.nextInt();
//        sectionList.remove(n);
        System.out.println(" Name : ");
        String name = in.next();
        employeeList.removeIf(item -> item.getName().equals(name));

    }

    @Override
    public void editemploye() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + " -> " + employeeList.get(i).getName());
        }
        int n = in.nextInt() - 1;
        System.out.println(" new employe name : ");
        String name = in.next();
        employeeList.get(n).setName(name);
        System.out.println(" new employe lastname : ");
        String desk = in.next();
        employeeList.get(n).setLastname(desk);
        System.out.println(" new employe patron : ");
        String patron = in.next();
        employeeList.get(n).setPatron(patron);
        System.out.println(" new employe birthday  : ");
        String birthday = in.next();
        employeeList.get(n).setBirthday(birthday);
        System.out.println(" new employe gender : ");
        char gender = in.next().charAt(0);
        employeeList.get(n).setGender(gender);
        System.out.println(" new employe salary  : ");
        double salary = in.nextDouble();
        employeeList.get(n).setSalary(salary);
    }

    @Override
    public void listemploye() {
        for (employee employee : employeeList) {
            System.out.println(employee);
        }

    }
}
