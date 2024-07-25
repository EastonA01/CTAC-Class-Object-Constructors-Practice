package org.example;

public class BankAccount {
    private final String accountHolder;
    private float balance;

        // Class constructor
        public BankAccount(String accountHolder, float balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
        // Methods
        public void deposit(float amount) {
            this.balance += amount;
        }
        public void withdrawal(float amount) {
            this.balance -= amount;
        }
        public void getBalance() {
            System.out.println(this.accountHolder +"'s Account Balance: " + balance);
        }
}
