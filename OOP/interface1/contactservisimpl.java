package OOP.interface1;

import java.util.Scanner;

public class contactservisimpl implements contactservis {
    private contact[] contacts = new contact[100];
    private int count = 0;
    private Scanner input = new Scanner(System.in);

    @Override
    public void addcontact() {
        System.out.print(" kiritilinuvchi kontaktlar soni : ");
        int n = input.nextInt();
        while (n > 0) {
            System.out.print(" Name : ");
            String name = input.next();
            System.out.print(" Number : ");
            String number = input.next();
            contact contact = new contact(name, number);
            contacts[count++] = contact;
            n--;
        }
    }

    @Override
    public void listcontact() {
        for (int i = 0; i < count; i++) {
            if (contacts[i] != null)
                System.out.println(contacts[i]);
        }
    }

    @Override
    public void deletecontact() {
        System.out.println(" kimni o'chirmoqchisz : ");
        String name = input.next();
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equals(name)) {
                contacts[i] = null;
            }
        }
    }

    @Override
    public void editcontact() {
        System.out.println(" kimni tahrirlamoqchisz : ");
        String name = input.next();
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equals(name)) {
                System.out.print(" Ismni kiriting : ");
                contacts[i].setName(input.next());
                System.out.print(" Raqamni kiriting : ");
                contacts[i].setNumber(input.next());
            }
        }
    }

    @Override
    public void searchcontact() {
        System.out.println(" kimni qidirmoqchisz : ");
        String name = input.next();
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equals(name)) {
                System.out.println(contacts[i]);
            }
        }
    }
}
