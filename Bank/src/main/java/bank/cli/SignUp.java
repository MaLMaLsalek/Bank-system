package bank.cli;

import bank.bankuser.client.User;

import static bank.cli.Hash.hashPassword;

public class SignUp {

    public void setUserName(User user, String id) {
        user.setId(id);
    }

    public void setUserAccountnum(User user) {
        user.setAccountnum(new Accountnum().createAccountNum());
    }

    public void setUserPassword(User user, String pass) {
        user.setPassword(hashPassword(pass));
    }
}
