package collactions.section.services;

import collactions.section.models.position;
import collactions.section.models.section;
import collactions.section.models.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sectionimpl implements SectionServis {
    private List<section> sectionList = new ArrayList<>();
    private List<position> positionList = new ArrayList<>();
    private List<employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addsection() {
        System.out.println(" Name : ");
        String name = scanner.next();
        System.out.println(" description : ");
        scanner = new Scanner(System.in);
        String desc = scanner.nextLine();
        section section = new section(name, desc);
        sectionList.add(section);
    }

    @Override
    public void deletesection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i + 1) + " -> " + sectionList.get(i).getName());
        }
//        int n = scanner.nextInt();
//        sectionList.remove(n);
        System.out.println(" Name : ");
        String name = scanner.next();
        sectionList.removeIf(item -> item.getName().equals(name));
    }

    @Override
    public void editsection() {
        for (int i = 0; i < sectionList.size(); i++) {
            System.out.println((i + 1) + " -> " + sectionList.get(i).getName());
        }
        int n = scanner.nextInt() - 1;
        System.out.println(" new section name : ");
        String name = scanner.next();
        sectionList.get(n).setName(name);
        System.out.println(" new section describtion : ");
        String desk = scanner.next();
        sectionList.get(n).setName(desk);
    }

    @Override
    public void listsection() {
        for (section section : sectionList) {
            System.out.println(section);
        }
    }

    @Override
    public void positionMenu() {
        boolean a = true;
        positionservis positionservis = new positionservisimpl(positionList);
        while (a) {
            System.out.println(" 1 -> Add position \n2 -> delete position \n3 -> edit position \n4 -> list position \n5 -> chiqish");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    positionservis.addposition();
                }
                case 2 -> {
                    positionservis.deletepositon();
                }
                case 3 -> {
                    positionservis.editposition();
                }
                case 4 -> {
                    positionservis.listposition();
                }
                case 5 -> {
                    a = false;
                }
            }
        }

    }

    @Override
    public void employemenyu() {
        boolean a = true;
        employeeeee employeeeee = new employeeeimpl(employeeList, sectionList, positionList);
        while (a) {
            System.out.println(" 1 -> Add employe \n2 -> delete employe \n3 -> edit employe \n4 -> list employe \n5 -> chiqish");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    employeeeee.addemploye();
                }
                case 2 -> {
                    employeeeee.deleteemploye();
                }
                case 3 -> {
                    employeeeee.editemploye();
                }
                case 4 -> {
                    employeeeee.listemploye();
                }
                case 5 -> {
                    a = false;
                }
            }
        }
    }
}
