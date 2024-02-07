package datastructure;

public class toqsontop {
    static void toqindexson(int[] c) {
        int n = c.length;
        int d = 0, f = 0;
        for (int element : c) {
            for (int i = 0; i < c.length; i++) {
                if (element == c[i]) {
                    d++;
                    if (d%2!=0) {
                        f = c[i];
                    }
                }
            }
        }
        System.out.println(f);
    }
    public static void main(String[] args) {
        int[] a = {5, 7, 2, 7, 5, 2, 5};
        toqindexson(a);
    }
}
