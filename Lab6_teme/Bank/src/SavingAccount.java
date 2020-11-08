public class SavingAccount extends Account {
    private double interests=0.03;

    SavingAccount(int number){
        super(number);
    }

    public void addInterests(){
         deposit(getBalance()*interests);
    }

    public String toString() {
        return "Saving Account " + getAccountNumber() + ": " + "balance = " + getBalance();
    }
}
