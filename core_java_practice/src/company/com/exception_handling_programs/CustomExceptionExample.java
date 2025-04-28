package company.com.exception_handling_programs;

//custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount() {

    }

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds For Withdraw. Your Available Balance is only : "+balance);
        }
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) throws InsufficientFundsException {
        BankAccount bankAccount = new BankAccount(101, "Nani", 15000.0);
        bankAccount.withDraw(10000);
        System.out.println("Remaining Balance : " + bankAccount.getBalance());
        System.out.println("\n");
        bankAccount.withDraw(7000); // this will raise InsufficientFundsException
    }
}
