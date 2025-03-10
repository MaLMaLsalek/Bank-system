package bank.cli;

import bank.data.DataBase;
import bank.user.User;

import java.util.ArrayList;

import static bank.cli.Hash.hashPassword;

public class SignUp {

    public boolean isUserExist(String id) {
        for (int i = 0; i < DataBase.getINSTANCE().getUser().size(); i++) {
            if (id.equals(DataBase.getINSTANCE().getUser().get(i).getId())) {
                return true;
            }
        }
        return false;
    }

    public void setUserName(User user, String id) {
        user.setId(id);
    }

    public void setUserAccountnum(User user) {
        user.setAccountnum(new Accountnum().createAccountNum());
    }

    public void setUserPassword(User user, String pass) {
        user.setPassword(hashPassword(pass));
    }

    public void addToDataBase(ArrayList<User> users, User user) {
        users.add(user);
    }
}
