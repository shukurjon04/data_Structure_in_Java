package filelar.Accountlar.gson.genetate;

import com.google.gson.Gson;

public class mian {
    public static void main(String[] args) {
        User user = new User("Shukurjon",1);
        Gson gson = new Gson();
        String s  = gson.toJson(user);
        System.out.println(s);
    }
}
