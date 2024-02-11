package OOP.enamm;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println((double) 1 / 3);
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.print("1 -> o'yinni boshlash  , 2 -> yakunlash  ");
            int key = scanner.nextInt();
            switch (key) {
                case 1 -> {
                    LAWEl[] values = LAWEl.values();
                    for (int i = 0; i < values.length; i++) {
                        System.out.println((i + 1) + "->" + values[i]);
                    }
                    int leveltype = scanner.nextInt() - 1;
                    LAWEl value = values[leveltype];
                    switch (value) {
                        case LOW -> {
                            System.out.print(" necha partiya oynaysiz : ");
                            int d = scanner.nextInt();
                            setmath(10, d);

                        }
                        case Medium -> {
                            System.out.print(" necha partiya oynaysiz : ");
                            int d = scanner.nextInt();
                            setmath(100, d);
                        }
                        case High -> {
                            System.out.print(" necha partiya oynaysiz : ");
                            int d = scanner.nextInt();
                            setmath(1000, d);
                        }
                    }


                }
                case 2 -> {
                    a = false;
                }
            }
        }
    }

    static void setmath(int max, int d) {
        Random random = new Random();
        int sonc = d;
        int yutuq = 0;
        int xato = 0;
        while (d != 0) {
            int a = random.nextInt(max);
            int b = random.nextInt(max);
            int c = random.nextInt(4);
            double result = 0;
            switch (c) {
                case 0 -> {
                    result = a + b;
                    System.out.print(a + "+" + b + "=");
                }
                case 1 -> {
                    result = a - b;
                    System.out.print(a + "-" + b + "=");
                }
                case 2 -> {
                    result = a * b;
                    System.out.print(a + "*" + b + "=");
                }
                case 3 -> {
                    if (b == 0) {
                        b = 1;
                    }
                    System.out.println("\n bo'linmaning butun qismini oling bo'lmasa miyyayiz dosh bermaydi😁👌👌👌 ");
                    result = a / b;
                    System.out.print(a + "/" + b + "=");
                }
            }
            Scanner scanner = new Scanner(System.in);
            double myresult = scanner.nextDouble();
            if (myresult == result) {
                yutuq++;
                System.out.println(" tog'ri javob berdingiz 🎉🎉🎉");
            } else {
                xato++;
                System.out.println(" javobingiz noto'g'ri 😟😟😟");
            }
            d--;
        }
        System.out.println();
        System.out.println(sonc + " partiya o'yningiz tugadi " + yutuq + " ta to'g'ri javob va " + xato + " ta xato javob berdingiz!!!\n ");
    }
}
