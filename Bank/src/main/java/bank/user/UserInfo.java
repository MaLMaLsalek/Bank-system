package bank.user;

import bank.user.transaction.History;

public class UserInfo extends User {

    private double balance;
    private History history;

    public UserInfo(String id, String password, double balance, History history) {
        super(id, password);
        this.balance = balance;
        this.history = history;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }
}
