import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> listAccounts=new ArrayList<Account>();

    public void addAccount(Account a){
        listAccounts.add(a);
    }

    public void update()
    {
        for(Account i: listAccounts )
        {
            if(i instanceof SavingAccount)
                ((SavingAccount) i).addInterests();
            if(i instanceof CurrentAccount)
                if(i.getBalance()<0)
                    System.out.println("\nAccount "+i.getAccountNumber()+" You are in overdraft!");
            i.print();
        }
    }

    public Account openingAccount(int number)
    {
        Account newAcc=new Account(number);
        addAccount(newAcc);
        return newAcc;
    }

    public void closingAccount(int number)
    {
        int ct=0;
        for(Account i:listAccounts) {
            if (i.getAccountNumber() == number)
                listAccounts.remove(ct);
            ct++;
        }
    }

    public void payDividend(double dividend)
    {
        for(Account i:listAccounts)
            i.withdraw(dividend);
    }
}
