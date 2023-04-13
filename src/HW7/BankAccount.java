package HW7;

import java.util.ArrayList;

public class BankAccount {
    private String FirstN, LastN; // first and last name of holder
    private String AccNum; // account number
    private String Street,City,State,ZipCode; // address for holder
    private double Balance; // account balance for holder
    private double Interest; // interest rate


    public BankAccount(String firstN, String lastN, String accNum
            , String street, String city, String state, String zipCode, double balance, double interest) {
        FirstN = firstN;
        LastN = lastN;
        AccNum = accNum;
        Street = street;
        City = city;
        State = state;
        ZipCode = zipCode;
        Balance = balance;
        Interest = interest;
    }

    public String getFirstN() {
        return FirstN;
    }

    public String getLastN() {
        return LastN;
    }

    public String getAccNum() {
        return AccNum;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public double getBalance() {
        return Balance;
    }

    public double getInterest() {
        return Interest;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "FirstN='" + FirstN + '\'' +
                ", LastN='" + LastN + '\'' +
                ", AccNum='" + AccNum + '\'' +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                ", Balance=" + Balance +
                ", Interest=" + Interest +
                '}';
    }


    // adds to the balance amount
    public double credit(double that){
        Balance = this.Balance + that;
        return Balance;
    }


    // takes away from the balance amount
    public double debit(double that){
        Balance = this.Balance - that;
        if (Balance < 0)
            return 0;
        else
            return Balance;
    }

    // takes away number of interest from balance amount
    public double addInterest(){
        Balance = this.Balance + this.Interest;
        return Balance;
    }

    // changes the interest rate
    public double setInterestRate(double rate){
        this.Interest = rate;
        return rate;
    }






}
