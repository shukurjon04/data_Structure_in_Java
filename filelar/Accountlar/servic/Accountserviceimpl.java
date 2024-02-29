package filelar.Accountlar.servic;

import filelar.Accountlar.models.Account;

import java.util.List;
import java.util.Scanner;

public class Accountserviceimpl implements Accountservis {
    Scanner scanner = new Scanner(System.in);
    fileservice fileservice = new fileserviceimpl();

    @Override
    public void Accountadd() {
        System.out.println(" ismni kiriting : ");
        String name = scanner.nextLine();
        System.out.println(" phone number : ");
        String phonenumber = scanner.next();
        System.out.println(" password : ");
        String password = scanner.next();
        Account account = new Account(name, phonenumber, password);
        String b = account.getName() + "#" + account.getPhonenumber() + "#" + account.getPassword();
        fileservice.writefile(b, true);

    }

    @Override
    public void Accountlist() {
        List<Account> accounts = fileservice.ACCOUNTS();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }
}
