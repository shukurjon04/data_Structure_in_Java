package datastructure;

public class yoqalganson {
    static void tushganson(int[] b){
        int d = 0;
        for (int i = 1; i < b.length; i++) {
            if ((b[i]-b[i-1])!=1){
                d = b[i-1]+1;
                System.out.println(d);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {4,5,7,8,9,11,13,16};
        tushganson(a);
    }
}
