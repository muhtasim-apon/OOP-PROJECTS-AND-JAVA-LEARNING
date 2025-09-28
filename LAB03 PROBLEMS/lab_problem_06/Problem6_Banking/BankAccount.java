public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double openingBalance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=openingBalance;
        totalAccounts++;
    }

    public void deposit(double amount){
        if(amount>0)
        {
            balance+=amount;
        }
    }

    public boolean withdraw(double amount){
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
        }
        return true;
    }

    public boolean transferTo(BankAccount other, double amount){
        if(withdraw(amount))
        {
            other.deposit(amount);
        }
        return true;
    }

    public static int getTotalAccounts(){ return totalAccounts; }
    public double getBalance(){ return balance; }
}
