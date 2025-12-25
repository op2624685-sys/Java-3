package projects.BankApp;

public class Customer {
    public static void main(String[] args) {
        BankAccount RaghavAccount = new BankAccount("RBI004582B97", "Raghav kumar");

        RaghavAccount.depositMoney(500);
        RaghavAccount.withdrawMoney(400);
        RaghavAccount.withdrawMoney(500);
        System.out.println(RaghavAccount.getBalance());
    }
}
