package datastructure;

public class kopchilikelement {
    static void topish(int[] c) {
        int n = c.length;
        int d = 0, f = 0;
        for (int element : c) {
            for (int i = 0; i < c.length; i++) {
                if (element == c[i]) {
                    d++;
                    if (d > (double)n / 2) {
                        f = c[i];
                    }
                }
            }
            d=0;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        int[] a = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        topish(a);
    }
}

