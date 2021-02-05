package exceptions.account;

public class AccountDemo {

    public static void main(String[] args) {
        Account c = new Account(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);

        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            //e.printStackTrace();
        }
    }

    public static class Account {
        private double balance;
        private int number;

        public Account(int number) {
            this.number = number;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        //throw an exception
        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount <= balance) {
                balance -= amount;
            } else {
                double needs = amount - balance;
                throw new InsufficientFundsException(needs);
            }
        }
    }
}
