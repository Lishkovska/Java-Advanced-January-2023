package _03_DefiningClasses_BankAccount;

public class BankAccount {

    private static int nextId = 1;

    private static double interestRate = 0.02;
    private int id;

    public BankAccount(){
        this.id = nextId;
        nextId++;
    }

    private double balance;

    public static void setInterestRate(double interestRate){
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int year){
        return BankAccount.interestRate * year * this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getId(){
        return id;
    }

}
