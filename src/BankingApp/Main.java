package BankingApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca1 = new CheckingAccount
                ("Hermione", 1000);
        SavingsAccount sa1 = new SavingsAccount
                ("Harry", 5000);

        ca1.addInterest();
        sa1.addInterest();

        ArrayList<BankAccount> accts =
                new ArrayList<>();
        accts.add(new CheckingAccount("Ron",
                2000));
        accts.add(new SavingsAccount("Draco",
                0));


    }
}
