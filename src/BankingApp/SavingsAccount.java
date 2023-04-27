package BankingApp;

public class SavingsAccount extends BankAccount{

    public SavingsAccount (String name, double balance){
        super(name, balance);
    }

    public double getRate (){
        if (this.balance < 50000)
            return 0.02;
        else
            return 0.03;
    }


} // class SavingsAccount
