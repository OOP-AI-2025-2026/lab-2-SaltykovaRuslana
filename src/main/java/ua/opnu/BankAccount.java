package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0;

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if(amount > 0) {
            double totalWithdrawal = amount + transactionFee;
            if (balance >= totalWithdrawal) {
                balance = balance - totalWithdrawal;
                return true;

            }
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (amount > 0) {
            double totalTransfer = amount + transactionFee;
            if (this.balance >= totalTransfer) {
                this.balance = this.balance - totalTransfer;
                receiver.balance = receiver.balance + amount;
                return true;
            }
        }
        return false;
    }
}