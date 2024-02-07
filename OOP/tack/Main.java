package OOP.tack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[100];
        Scanner input = new Scanner(System.in);
        int count =0;
        while (true){
            System.out.println(" 1 -> ro'yxatdan o'tish , 2 -> tizimga kirish ");
            int n = input.nextInt();
            switch (n){
                case 1 -> {
                    System.out.print(" firstname: ");
                    String firstname = input.next();
                    System.out.print(" lastname: ");
                    String lastname = input.next();
                    System.out.print(" phonenumber: ");
                    String phonenumber = input.next();
                    System.out.print(" email: ");
                    String email = input.next();
                    System.out.print(" password: ");
                    String password = input.next();
                    users[count] = new User(firstname,lastname,phonenumber,email,password);
                    count++;
                    System.out.println(" succesful registered 😊😊😊");
                }
                case 2 -> {
                    System.out.print(" phonenumber: ");
                    String phonenumber = input.next();
                    System.out.print(" password: ");
                    String password = input.next();
                    int index =-1;
                    for (int i = 0; i < count; i++) {
                        if (users[i].phonenumber.equals(phonenumber) && users[i].password.equals(password)){
                            index = i;
                            break;
                        }
                    }
                    if (index == -1){
                        System.out.println(" password or phonenumber incorrect 😟😟😟");
                    }
                    else {
                        System.out.println(users[index].firstname + "  " + users[index].lastname + " welcom to java backend🎉🎉🎉🎉");
                    }
                }
            }
        }
    }
}
