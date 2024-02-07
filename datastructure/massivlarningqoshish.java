package datastructure;

import java.util.Arrays;

public class massivlarningqoshish {
    public static void main(String[] args) {
        int[] a = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
        int[] b = { 5, 7, 9, 25 };
        int n = b.length;
        int m = a.length  ;
        int j=0;
        int k =0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]==-1) {
                int temb =0;
                temb =a[j];
                a[j]=a[i];
                a[i]= temb;
                j++;
                k++;
            }
        }
        for (int i = k; i < a.length-1; i++) {
             if (a[i-1]>a[i]){
                 int tem =0;
                 tem =a[i];
                 a[i]=a[i-1];
                 a[i-1] =tem;
             }
        }
        for (int i = 0; i < b.length; i++) {
            a[i]=b[i];
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
