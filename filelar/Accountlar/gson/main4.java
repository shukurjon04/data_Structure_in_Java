package filelar.Accountlar.gson;

import com.google.gson.Gson;
import filelar.Accountlar.gson.genetate.User;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class main4 {
    public static void main(String[] args) {
        File file = new File("Shukurjon.txt");
        List<User> list = new ArrayList<>();
       /* list.add(new User("Shukurjon", "+998905830721"));
        list.add(new User("Boqiyev", "+998902040721"));
        list.add(new User("Olmasov", "+998902050721"));
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
        try {
            FileOutputStream stream = new FileOutputStream(file);
            stream.write(json.getBytes());
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
