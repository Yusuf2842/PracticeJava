package main.atmProject.atmClass;

public class atmAccount {
    // Common properties and methods for all accounts
    private double balance;

    public void atmAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) { //TODO: Figure out how to use this method
        this.balance = amount;
    }

    public void test() {
        System.out.println("Test line: " + this.balance);
    }

}
