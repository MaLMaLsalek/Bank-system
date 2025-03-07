package bank.data;

import bank.user.User;
import bank.user.UserInfo;

import java.util.ArrayList;

public class DataBase {

    ArrayList<User> user = new ArrayList<>();

    ArrayList<UserInfo> userInfos = new ArrayList<>();

    public void addUser(User x){
        user.add(x);
    }

    public void addUserInfos(UserInfo x){
        userInfos.add(x);
    }

    public boolean isUserExist(User x){
        for (int i = 0 ; i < user.size() ; i ++){
            if (x.equals(user.get(i))){
                return true;
            }
        }
        return false;
    }

}
