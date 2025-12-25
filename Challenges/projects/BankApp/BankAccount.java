package projects.BankApp;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter
    double getBalance() {
        return balance;
    }

    // constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposite");
        } else {
            balance += money;
        }
    }

    public double withdrawMoney (double money){
        if (money <= 0) {
            System.out.println("Invalid Withdrawl");
        } else if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("Your balance is :- " + balance);
            money = balance;
            balance = 0;
        }
        return money;
    }

}
