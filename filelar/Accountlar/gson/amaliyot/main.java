package filelar.Accountlar.gson.amaliyot;

import com.google.gson.Gson;

public class main {
    public static void main(String[] args) {
        geo ge = new geo(654.123,87456.2131);
        adress adress = new adress("ijodkorlar","qurbonqashqar","qoqon","87456",ge);
        company company = new company("epam","gsrgrgrgrgdsfgsrgrgrg","efesfrfrgrgfrfrfrfrff");
        xodim xodim = new xodim(1,"Shukurjon","qaklesan","shjukurjon@gmail.com",adress,"+998912868123","olcha.uz",company);
        Gson gson = new Gson();
        String json = gson.toJson(xodim);
        System.out.println(json);
    }
}
