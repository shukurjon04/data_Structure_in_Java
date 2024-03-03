package filelar.Accountlar.gson;

import com.google.gson.Gson;
import filelar.Accountlar.gson.genetate.User;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("salom", "salom");
        // Json text formati
        String a = "{\"name\" :\"Shukurjon\" , \"number\" : \"+998912868123\"}";
        Gson gson = new Gson();
   /*     User user = gson.fromJson(a, User.class);
        System.out.println(user.getName() + " " + user.getNumber());*/
    }
}
