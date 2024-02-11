package OOP.interface1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        contactservis contactservis = new contactservisimpl();
        Scanner in = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println(" 1 -> kontakt qoshish ");
            System.out.println(" 2 -> kontakt ro'yxati ");
            System.out.println(" 3 -> kontakt o'chirish ");
            System.out.println(" 4 -> kontakt tahrirlash ");
            System.out.println(" 5 -> kontakt qidirish ");
            System.out.println(" 6 -> yakunlash ");
            int n = in.nextInt();
            switch (n) {
                case 1 -> {
                    contactservis.addcontact();
                }
                case 2 -> {
                    contactservis.listcontact();
                }
                case 3 -> {
                    contactservis.deletecontact();
                }
                case 4 -> {
                    contactservis.editcontact();
                }
                case 5 -> {
                    contactservis.searchcontact();
                }
                case 6 -> {
                    a = false;
                }
                default -> {
                    System.out.println(" bo'limlarni tanlang !!!");

                }
            }


        }
    }
}
