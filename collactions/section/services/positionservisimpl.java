package collactions.section.services;
import collactions.section.models.position;
import collactions.section.models.section;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class positionservisimpl implements positionservis{
    Scanner scanner = new Scanner(System.in);
    private List<position> positionList ;

    public positionservisimpl(List<position> positionList) {
        this.positionList = positionList;
    }

    @Override
    public void addposition() {
        System.out.println(" Name : ");
        String name = scanner.next();
        System.out.println(" description : ");
        scanner = new Scanner(System.in);
        String desc = scanner.nextLine();
        position position = new position(name, desc);
        positionList.add(position);
    }

    @Override
    public void deletepositon() {
        for (int i = 0; i < positionList.size(); i++) {
            System.out.println((i + 1) + " -> " + positionList.get(i).getName());
        }
//        int n = scanner.nextInt();
//        sectionList.remove(n);
        System.out.println(" Name : ");
        String name = scanner.next();
        positionList.removeIf(item -> item.getName().equals(name));
    }

    @Override
    public void editposition() {
        for (int i = 0; i < positionList.size(); i++) {
            System.out.println((i + 1) + " -> " + positionList.get(i).getName());
        }
        int n = scanner.nextInt() - 1;
        System.out.println(" new position name : ");
        String name = scanner.next();
        positionList.get(n).setName(name);
        System.out.println(" new position describtion : ");
        String desk = scanner.next();
        positionList.get(n).setName(desk);

    }

    @Override
    public void listposition() {
        for (position position : positionList) {
            System.out.println(position);
        }
    }
}
