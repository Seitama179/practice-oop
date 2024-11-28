package model.transaction;

import model.account.BankAccount;

public abstract class Transaction {
    protected String accountNumber;
    protected double amount;

    public Transaction(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public abstract void processTransaction(BankAccount account);
    public abstract void printTransactionDetails();
}
