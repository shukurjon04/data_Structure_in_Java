package filelar.Accountlar.gson;

import com.google.gson.Gson;
import filelar.Accountlar.gson.genetate.User;

import java.io.*;

public class main3 {
    public static void main(String[] args) {
        File file = new File("Shukurjon.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String row ;
            StringBuilder stringBuilder = new StringBuilder();
            while ((row=reader.readLine())!=null){
                stringBuilder.append(row);
            }
            fileInputStream.close();
            String s = stringBuilder.toString();
            Gson gson = new Gson();
            /*User user = gson.fromJson(s, User.class);
            System.out.println(user.getName()+" "+user.getNumber());*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
