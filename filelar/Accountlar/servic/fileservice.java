package filelar.Accountlar.servic;

import filelar.Accountlar.models.Account;

import java.util.List;

public interface fileservice {
    void writefile(String text, boolean isappened);

    List<Account> ACCOUNTS();
}
