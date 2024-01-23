package datastructure;

public class massivdasonsummasi {
    static boolean sum(int[] a , int x){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]+a[j]==x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] s ={1,2,4,9,3,8,5,6,7};
        
    }
}
