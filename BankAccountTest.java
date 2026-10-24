public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Sai Sandeep", 5000, "ACC101");

        BankAccount account2 =
                new BankAccount("K Srihari", 10000, "ACC102");

        BankAccount account3 =
                new BankAccount("Rahul", 7500, "ACC103");

        account1.deposit(2000);
        account2.withdraw(3000);
        account3.deposit(1500);

        account1.accountInfo();
        account2.accountInfo();
        account3.accountInfo();
    }
}