package bank.data;

import bank.bankuser.client.User;

import java.util.ArrayList;

public class DataBase {
    private static DataBase INSTANCE;

    ArrayList<User> user = new ArrayList<>();

    public void addUser(User x) {
        user.add(x);
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public boolean isAccountNumExist(long accountnum) {
        for (int i = 0; i < user.size(); i++) {
            if (accountnum == user.get(i).getAccountnum()) {
                return true;
            }
        }
        return false;
    }

    public static DataBase getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DataBase();
        }
        return INSTANCE;
    }
}
