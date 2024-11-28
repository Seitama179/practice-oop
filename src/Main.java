import controller.Controller;
import model.account.CheckingAccount;
import model.account.SavingsAccount;
import model.transaction.DepositTransaction;
import model.transaction.Transaction;
import model.transaction.WithdrawTransaction;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);

        SavingsAccount sa = new SavingsAccount("SA001", "Nguyen Van A", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA001", "Tran Thi B", 2000, 1000);

        controller.addAccount(sa);
        controller.addAccount(ca);
//        System.out.println("Danh sách tài khoản:");
//        controller.listAccounts();

        Transaction deposit = new DepositTransaction("SA001", 2000);
        controller.processTransaction(deposit);

        Transaction overdraft1 = new WithdrawTransaction("CA001", 5000);
        controller.processTransaction(overdraft1);

        Transaction overdraft2 = new WithdrawTransaction("CA001", 1000);
        controller.processTransaction(overdraft2);
    }
}