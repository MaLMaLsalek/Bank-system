package bank.data;

import bank.user.User;

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

    public static DataBase getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new DataBase();
        }
        return INSTANCE;
    }
}
