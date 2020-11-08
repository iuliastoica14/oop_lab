public class Main {
    public static void main(String[] args)
    {
        SavingAccount sa=new SavingAccount(1111);
        SavingAccount sb=new SavingAccount(1112);
        CurrentAccount ca=new CurrentAccount(1000);
        CurrentAccount cb=new CurrentAccount(1001);

        sa.deposit(100);
        sb.deposit(1000);
        ca.deposit(2000);
        ca.withdraw(200);
        cb.withdraw(10);
        ca.withdraw(3000);

        Bank b=new Bank();
        b.addAccount(sa);
        b.addAccount(sb);
        b.addAccount(ca);
        b.addAccount(cb);

        b.update();
        System.out.println();

        Account newAcc=b.openingAccount(100);
        newAcc.deposit(1000);
        b.update();
        System.out.println();

        b.closingAccount(1001);
        b.update();
        System.out.println();

        b.payDividend(10);
        b.update();
    }
}
