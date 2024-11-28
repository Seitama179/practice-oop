package model.transaction;

import model.account.BankAccount;

public class DepositTransaction extends Transaction {
    public DepositTransaction(String accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    public void processTransaction(BankAccount account) {
        account.deposit(amount);
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Giao dịch nạp tiền:");
        System.out.println("Tài khoản: " + accountNumber + ", Số tiền: " + amount);
    }
}
