package datastructure;

import java.util.Arrays;

public class massivniaylantir {
    static String aylan(int[] a , int d, int n){
        int[] temp = new int[n];
        int k=0;
        for (int i = d; i < n ; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            a[i] =temp[i];

        }
        return Arrays.toString(a);

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 2;
        System.out.println(aylan(arr, d, N));
    }
}
