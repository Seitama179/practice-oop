package controller;

import model.account.BankAccount;
import model.transaction.Transaction;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<BankAccount> accounts;
    private View view;

    public Controller(View view) {
        this.accounts = new ArrayList<>();
        this.view = view;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void processTransaction(Transaction transaction) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(transaction.getAccountNumber())) {
                transaction.processTransaction(account);
                view.displayTransactionDetails(transaction);
                view.displayAccountDetails(account);
                return;
            }
        }
        System.out.println("Tài khoản không tồn tại.");
    }

    public void listAccounts() {
        for (BankAccount account : accounts) {
            System.out.println("AccountNumber: " + account.getAccountNumber());
        }
    }
}
