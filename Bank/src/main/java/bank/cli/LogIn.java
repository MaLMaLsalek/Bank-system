package bank.cli;

import bank.data.DataBase;

import static bank.bankuser.client.Hash.hashPassword;

public class LogIn {

    public boolean isUserExist(String id) {
        for (int i = 0; i < DataBase.getINSTANCE().getUser().size(); i++) {
            if (id.equals(DataBase.getINSTANCE().getUser().get(i).getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean isUserPassTrue(String pass) {
        for (int i = 0; i < DataBase.getINSTANCE().getUser().size(); i++) {
            if (hashPassword(pass).equals(DataBase.getINSTANCE().getUser().get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
}