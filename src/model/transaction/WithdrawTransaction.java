package model.transaction;

import model.account.BankAccount;

public class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(String accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    public void processTransaction(BankAccount account) {
        if (account.withdraw(amount)) {
            System.out.println("Rút tiền thành công.");
        } else {
            System.out.println("Rút tiền thất bại.");
        }
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Giao dịch rút tiền:");
        System.out.println("Tài khoản: " + accountNumber + ", Số tiền: " + amount);
    }
}
