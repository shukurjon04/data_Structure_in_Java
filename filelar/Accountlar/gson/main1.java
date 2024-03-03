package filelar.Accountlar.gson;

import com.google.gson.Gson;
import filelar.Accountlar.gson.genetate.User;

import java.io.File;
import java.io.FileOutputStream;

public class main1 {
    public static void main(String[] args) {
/*       *//* User user = new User("Shukurjon","+998912868123");*//*
        Gson gson = new Gson();
        String jsonString = gson.toJson(user);
        File file = new File("Shukurjon.txt");
        try {
            FileOutputStream stream= new FileOutputStream(file);
            stream.write(jsonString.getBytes());
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
