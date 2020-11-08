public class CurrentAccount extends Account {
    private int limit=100;

    CurrentAccount(int number){
        super(number);
    }

    public void withdraw(double sum) {
        if (getBalance()-sum > -limit)
            super.withdraw(sum);
        else
            System.err.println("Account "+getAccountNumber()+" Can't withdraw that much money.");
    }

    public String toString() {
        return "Current Account " + getAccountNumber() + ": " + "balance = " + getBalance();
    }

}
