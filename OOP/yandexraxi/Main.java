package OOP.yandexraxi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        yandextaxi yandextaxi = new yandextaxi();
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println(" Menyuni tanlang  :  ");
            System.out.println("0 -> chiqish ");
            Usertype[] values = Usertype.values();
            for (int i = 0; i < values.length; i++) {
                System.out.println((i + 1) + " -> " + values[i]);
            }
            System.out.println("3 -> monitor ");
            int n = scanner.nextInt();
            switch (n) {
                case 0 -> {
                    a = false;
                }
                case 1 -> {
                   yandextaxi.DreiverMenyu();
                }
                case 2 -> {
                   yandextaxi.PassengerMenyu();
                }
                case 3 -> {
                    yandextaxi.monitoring();
                }
            }
        }
    }
}
