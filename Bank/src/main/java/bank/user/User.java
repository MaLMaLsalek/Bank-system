package bank.user;

public class User {
    private String id;
    private long accountnum;
    private String password;

    public User(String id, long accountnum, String password) {
        this.id = id;
        this.accountnum = accountnum;
        this.password = password;
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

}
