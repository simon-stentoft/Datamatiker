package Chapter9;

import java.util.Date;

public class Opg7 {
    public static void main(String[] args) {

        Account Account1 = new Account(1122,20000);
        Account1.setAnnualInterestRate(4.5);
        Account1.withdraw(2500);
        Account1.deposit(3000);
        System.out.println("For account ID: " + Account1.getId());
        System.out.println("Balance is now: " + Account1.getBalance());
        System.out.println("The monthly interest is: " + Account1.getMonthlyInterest());
        System.out.println("The account was created on the date: " + Account1.getDateCreated());

    }
}
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();

    }
    Account(int newID, double newBalance) {
        balance = newBalance;
        id = newID;
        dateCreated = new Date();

    }
    //Mutators methods
    public void setId(int newID) {
        id = newID;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate;
    }
    //Accessor methods
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    } //Methods
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    public double withdraw(double amount) { //decrease balance by amount withdrawed
        return balance -= amount;
    }
    public double deposit(double amount) { //increase balance by amount
        return balance += amount;
    }
}
