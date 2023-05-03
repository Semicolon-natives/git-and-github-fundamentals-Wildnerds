package tdd;

public class Account {

    int balance;

    public Account()
    {
        balance = 2000;
    }
public void deposit(int amount)
{
    balance = balance + amount;
}
    public int getBalance() {

        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void multiply(int amount) {
        balance = balance * amount;
    }
}
