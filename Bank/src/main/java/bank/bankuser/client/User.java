package bank.bankuser.client;

import bank.bankuser.BankUser;

import java.util.ArrayList;

public class User extends BankUser {
    private long accountnum;
    private double balance;
    private ArrayList<String> history;

    public User(String id, long accountnum, String password, double balance, ArrayList<String> History) {
        super(id, password);
        this.accountnum = accountnum;
        this.balance = balance;
        this.history = History;
    }

    public long getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(long accountnum) {
        this.accountnum = accountnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}
