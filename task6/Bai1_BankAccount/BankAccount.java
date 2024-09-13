package task6.Bai1_BankAccount;

public class BankAccount {
    //Khai báo các thuộc tính có phạm vi truy cập là private
    private String accountNumber;
    private double balance;

    //Constructor mặc đinhj ko có tham số
    public BankAccount() {
    }

    //Constructor đầy đủ tham số
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Các hàm getter, setter để lấy và cập nhật dữ liệu
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
