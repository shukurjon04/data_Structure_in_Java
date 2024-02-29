package filelar.Accountlar.servic;

import filelar.Accountlar.models.Account;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileserviceimpl implements fileservice {
    File file = new File("Shukurjon.txt");
    Scanner in = new Scanner(System.in);

    @Override
    public void writefile(String text, boolean isappened) {
        try {
            file.createNewFile();
            FileOutputStream stream = new FileOutputStream(file, isappened);
            stream.write(text.getBytes());
            stream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Account> ACCOUNTS() {
        List<Account> accounts = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String row;
            while ((row = reader.readLine()) != null) {
                String[] s = row.split("#");
                if (s.length<2) {
                    Account a = new Account(s[0], " bosh", " bosh");
                    accounts.add(a);
                } else {
                    Account a = new Account(s[0], s[1], s[2]);
                    accounts.add(a);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accounts;
    }
}
