package bank.cli;

import bank.bankuser.client.AccountNumber;
import bank.bankuser.client.User;

import static bank.bankuser.client.Hash.hashPassword;

public class SignUp {

    public void setUserName(User user, String id) {
        user.setId(id);
    }

    public void setUserAccountnum(User user) {
        user.setAccountnum(new AccountNumber().createAccountNum());
    }

    public void setUserPassword(User user, String pass) {
        user.setPassword(hashPassword(pass));
    }
}