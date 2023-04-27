package BankingApp;

// Abstract base class (OOP TERMINOLOGY)
public abstract class BankAccount {
    protected String name;
    protected double balance;

    protected BankAccount(String name,
                       double balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract double getRate();


    public void credit (double amt){
        this.balance = this.balance + amt;
    }

    public void addInterest(){
        balance = balance * (1 + getRate());
    }


}

