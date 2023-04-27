package HW7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Gop","Arop","180939772","528 Boyden Street",
                "Syracuse","NY","13206",2034.04,4);
        BankAccount b2 =  new BankAccount("John","Smith","203456794"
                , "20 Park Road","Salt Lake City","UT","84101",1039.20,5);
        BankAccount b3 = new BankAccount("Will","Smith","589549093"
                , "1207 Skittles Ave","Los Angeles","CA","90032",3240596.50,8);



        System.out.println(b1.credit(50));
        System.out.println(b1.debit(30));
        System.out.println(b1.debit(3000) == 0.0);


        System.out.println(b2.credit(150.20));
        System.out.println(b2.debit(75.60));
        System.out.println(b2.debit(2000) == 0.0);


        System.out.println(b3.credit(700.03));
        System.out.println(b3.debit(90.34));
        System.out.println(b3.debit(50000000) == 0.0);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(b1);
        accounts.add(b2);
        accounts.add(b3);
        displayAccounts(accounts);

    }

    public static void displayAccounts(ArrayList<BankAccount> accounts){
        for (BankAccount account : accounts) System.out.println(account);

    }


}
