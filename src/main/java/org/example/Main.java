package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("System Online");
        // Bank Account Code For Pt 1, commented out for part 2.
            BankAccount myAccount = new BankAccount("Mike Myers", 500);
            myAccount.deposit(100);
            myAccount.getBalance();
        // Bank Transfer Method
            BankAccount larryAccount = new BankAccount("Larry", 5000);
            BankAccount maryAccount = new BankAccount("Mary", 300);
            larryAccount.withdrawal(100);
            maryAccount.deposit(100);
            larryAccount.getBalance();
            maryAccount.getBalance();
        // Product method
            Product gasoline = new Product("Gasoline", 4.0, 10);
            gasoline.printProduct(gasoline);
            gasoline.totalCost(gasoline);
    }
}