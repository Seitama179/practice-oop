package view;

import model.account.BankAccount;
import model.account.CheckingAccount;
import model.account.SavingsAccount;
import model.transaction.Transaction;

public class View {
    public void displayAccountDetails(BankAccount account) {
        System.out.println("Thông tin tài khoản:");
        System.out.println("Số tài khoản: " + account.getAccountNumber());
        System.out.println("Tên chủ tài khoản: " + account.getAccountHolder());
        System.out.println("Số dư: " + account.getBalance());
        if (account instanceof SavingsAccount) {
            System.out.println("Lãi suất: " + ((SavingsAccount) account).getInterestRate());
        } else if (account instanceof CheckingAccount) {
            System.out.println("Hạn mức thấu chi: " + ((CheckingAccount) account).getOverdraftLimit());
        }
        System.out.println("---------------------------");
    }

    public void displayTransactionDetails(Transaction transaction) {
        transaction.printTransactionDetails();
    }
}
