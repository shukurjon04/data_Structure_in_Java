package OOP.yandexraxi;

import java.util.Scanner;

public class yandextaxi {
    private Driver[] drivers = new Driver[100];
    private Passenger[] passengers = new Passenger[100];
    private Monitor[] monitors = new Monitor[100];
    private int Mcount = 0;
    private int pcount = 0;
    private int dcount = 0;
    private Scanner scanner = new Scanner(System.in);

    public void DreiverMenyu() {
        boolean a = true;
        while (a) {
            System.out.println(" 1 -> ro'yxatdan o'tish , 2 -> tizimga kirish , 3 -> chiqish");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print(" avtomobil raqami :  ");
                    String number = scanner.next();
                    System.out.print(" avtomobil modeli :  ");
                    String model = scanner.next();
                    System.out.println(" tarif turini tanlang :  ");
                    trafictype[] values = trafictype.values();
                    for (int i = 0; i < values.length; i++) {
                        System.out.println((i + 1) + " -> " + values[i]);
                    }
                    int tariftanla = scanner.nextInt();
                    trafictype value = values[tariftanla - 1];
                    System.out.print(" phonenumber :  ");
                    String phonenumber = scanner.next();
                    System.out.print(" password :  ");
                    String password = scanner.next();
                    Driver driver = new Driver(number, model, value, password, phonenumber);
                    drivers[dcount++] = driver;
                }
                case 2 -> {
                    System.out.print(" phonenumber :  ");
                    String phonenumber = scanner.next();
                    System.out.print(" password :  ");
                    String password = scanner.next();
                    int driverindex = -1;
                    for (int i = 0; i < dcount; i++) {
                        if (drivers[i].phonenumber.equals(phonenumber) && drivers[i].password.equals(password)) {
                            driverindex = i;
                            break;
                        }
                    }
                    if (driverindex == -1) {
                        System.out.println(" Haydovchi topilmadi topilmadi!!! ");
                    } else {
                        System.out.println(drivers[driverindex].number + " Tizimga xush kelibsz 👌👌👌 ");
                        drivertaxi(driverindex);
                    }

                }
                case 3 -> {
                    a = false;
                }
            }
        }
    }

    public void drivertaxi(int index) {
        boolean a = true;
        Driver driver = drivers[index];
        while (a) {
            System.out.println(" 1 -> yo'lovchini manzilga eitish ,2 ->  hozirgi yolovchi malumotlari  3 -> chiqish  ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    for (int i = 0; i < Mcount; i++) {
                        if (monitors[i].driver == driver && !monitors[i].isFinished) {
                            monitors[i].isFinished = true;
                            System.out.println(" yolovchi mazilga yetkazilmoqda..... ");
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; i < Mcount; i++) {
                        if (monitors[i].driver == driver && !monitors[i].isFinished) {
                            System.out.println(monitors[i].passenger);
                        }
                    }
                }
                case 3 -> {
                    a = false;
                }
            }
        }
    }

    public void PassengerMenyu() {
        boolean a = true;
        while (a) {
            System.out.println(" 1 -> ro'yxatdan o'tish , 2 -> tizimga kirish , 3 -> chiqish  ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println(" telefon raqami : ");
                    String phonenumber = scanner.next();
                    System.out.println(" ismi : ");
                    String name = scanner.next();
                    System.out.println(" password : ");
                    String password = scanner.next();
                    Passenger passenger = new Passenger(phonenumber, name, password);
                    passengers[pcount++] = passenger;

                }
                case 2 -> {
                    System.out.println(" telefon raqami : ");
                    String phonenumber = scanner.next();
                    System.out.println(" password : ");
                    String password = scanner.next();
                    int passengerindex = -1;
                    for (int i = 0; i < pcount; i++) {
                        if (passengers[i].phonenumber.equals(phonenumber) && passengers[i].password.equals(password)) {
                            passengerindex = i;
                            break;
                        }
                    }
                    if (passengerindex == -1) {
                        System.out.println(" Yo'lovchi  topilmadi!!! ");
                    } else {
                        System.out.println(passengers[passengerindex].name + " Tizimga xush kelibsz 👌👌👌 ");
                        passengertaxi(passengerindex);
                    }
                }
                case 3 -> {
                    a = false;
                }
            }
        }
    }

    public void passengertaxi(int index) {
        boolean a = true;
        while (a) {
            System.out.println(" 1 -> taksi chaqirish , 2 -> chiqish ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    Passenger passenger = passengers[index];
                    trafictype[] values = trafictype.values();
                    for (int i = 0; i < values.length; i++) {
                        System.out.println((i + 1) + " -> " + values[i]);
                    }
                    int n1 = scanner.nextInt() - 1;
                    trafictype trafictype = values[n1];
                    //shu yerda ozim ozgartirdm
                    Driver tanlangandriver = tanlanganlar(trafictype, dcount);
                    System.out.print(" Turgan joyi : ");
                    String currentplace = scanner.next();
                    System.out.print(" Boradigan joi : ");
                    String targetplace = scanner.next();
                    boolean b = false;
                    Monitor monitor = new Monitor(passenger, tanlangandriver, currentplace, targetplace,b);
                    monitors[Mcount++] = monitor;
                }
                case 2 -> {
                    a = false;
                }
            }
        }
    }

    public void monitoring() {
        for (int i = 0; i < Mcount; i++) {
            Monitor monitor = monitors[i];
            System.out.println(monitor);
        }

    }

    public Driver tanlanganlar(trafictype trafictype, int son) {
        int b = 0;
        for (int i = 0; i < son; i++) {
            if (drivers[i].trafictype.equals(trafictype) && !drivers[i].isfree) {
                drivers[b] = drivers[i];
                b++;
            }
        }
        for (int i = 0; i < b; i++) {
            System.out.println((i + 1) + " -> " + drivers[i]);
        }
        int n = scanner.nextInt() - 1;
        Driver driver = drivers[n];
        driver.isfree = true;
        return driver;
    }


    private class Driver {
        private String number;
        private String model;
        private trafictype trafictype;
        private String password;
        private String phonenumber;
        private boolean isfree;

        @Override
        public String toString() {
            return "Driver { " +
                    "number='" + number + '\'' +
                    ", model='" + model + '\'' +
                    ", turi =" + trafictype +
                    " } ";
        }

        public Driver(String number, String model, OOP.yandexraxi.trafictype trafictype, String password, String phonenumber) {
            this.number = number;
            this.model = model;
            this.trafictype = trafictype;
            this.password = password;
            this.phonenumber = phonenumber;
        }
    }

    private class Passenger {
        private String phonenumber;
        private String name;
        private String password;

        public Passenger(String phonenumber, String name, String password) {
            this.phonenumber = phonenumber;
            this.name = name;
            this.password = password;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "phonenumber='" + phonenumber + '\'' +
                    ", name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    private class Monitor {
        private Passenger passenger;
        private Driver driver;
        private String currentplace;
        private String targetplace;
        private boolean isFinished;

        public Monitor(Passenger passenger, Driver driver, String currentplace, String targetplace,boolean b) {
            this.passenger = passenger;
            this.driver = driver;
            this.currentplace = currentplace;
            this.targetplace = targetplace;
            this.isFinished = b;
        }

        @Override
        public String toString() {
            return "Monitor { " +
                    "passenger=" + passenger.name +
                    ", driver=" + driver.number +
                    ", currentplace='" + currentplace + '\'' +
                    ", targetplace='" + targetplace + '\'' +
                    ", isFinished='" + isFinished + '\'' +
                    " } ";
        }
    }
}
