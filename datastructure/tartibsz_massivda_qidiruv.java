package datastructure;

import java.util.Scanner;

public class tartibsz_massivda_qidiruv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tartibsz = {5,4,1,8,75,2,6,95,24,15,35,58,46};
        System.out.print("qidirmoqchi soningizni kiriting : ");
        int qidir = in.nextInt();
        int d= 0;
        for (int i = 0; i < tartibsz.length; i++) {
            if (tartibsz[i] == qidir){
                d++;
                System.out.println("siz qidirgan son massivda mavjud va uning indexi "+i+" ga teng");
            }
        }
        if (d==0){
            System.out.println("siz qidirgan son massivda mavjud emas");
        }
    }
}
