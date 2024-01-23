package datastructure;

import java.util.Scanner;

public class tartibli_massivda_qidiruv {
    static int qidiruv(int[] a,int key ){
        int boshi = 0;
        int oxiri = a.length-1;
        while (boshi<=oxiri) {
            int orta = (boshi+oxiri)/2;
            if (a[orta] == key)
                return orta;
            if (a[orta]<key){
                boshi= orta+1;
            }
            if (a[orta]>key){
                boshi =orta-1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] d = {1,2,3,4,5,6,7,8,9};
        System.out.print("kalitni kiriting : ");
        int k = in.nextInt();
        System.out.println(qidiruv(d,k));

    }

}
