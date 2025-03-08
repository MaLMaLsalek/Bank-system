package bank.user;

public class UserInfo extends User {

    private double balance;
    private History history;

    public UserInfo(String id, long accountnum, String password, double balance, History history) {
        super(id, accountnum, password);
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
