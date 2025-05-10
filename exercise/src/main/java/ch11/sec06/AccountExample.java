package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposit(10000);
            System.out.println("잔액:" + account.getBalance());
            account.withdraw(5000);
            System.out.println("잔액:" + account.getBalance());
            account.withdraw(7000);
            System.out.println(account.getBalance());
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
