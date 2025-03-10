package bank.user;

import java.util.ArrayList;

public class User {
    private String id;
    private long accountnum;
    private String password;
    private double balance;
    private ArrayList<String> history;

    public User() {

    }

    public User(String id, long accountnum, String password, double balance, ArrayList<String> History) {
        this.id = id;
        this.accountnum = accountnum;
        this.password = password;
        this.balance = balance;
        this.history = History;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(long accountnum) {
        this.accountnum = accountnum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void addHistoy(String History) {
        this.history.add(History);
    }
}
