package filelar.Accountlar;

import filelar.Accountlar.servic.Accountserviceimpl;
import filelar.Accountlar.servic.Accountservis;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Accountservis accountservis = new Accountserviceimpl();
        while (true) {
            System.out.println("1 -> add acount \n2 -> list");
            int n = in.nextInt();
            switch (n) {
                case 1 -> accountservis.Accountadd();
                case 2 -> accountservis.Accountlist();
            }
        }
    }
}
