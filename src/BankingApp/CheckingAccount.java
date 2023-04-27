package BankingApp;

public class CheckingAccount extends BankAccount {
    private double rate;

    public CheckingAccount(String name, double balance){
        super(name,balance); // calls the base class constructor
        this.rate = 0.01; // 1 percent
    }

    // this code overrides the method in the base class
    public double getRate(){
        return rate;
    }


}
