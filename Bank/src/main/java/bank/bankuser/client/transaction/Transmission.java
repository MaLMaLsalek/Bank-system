package bank.bankuser.client.transaction;

import bank.data.DataBase;

public class Transmission {

    public void transmissionMonyTo(double balance, double money, long accountnum) {
        double x = DataBase.getINSTANCE().getUser().get(DataBase.getINSTANCE().findAccountIndex(accountnum)).
                getBalance();
        if (balance - money >= 0) {
            if (DataBase.getINSTANCE().isAccountNumExist(accountnum)) {
                DataBase.getINSTANCE().getUser().get(DataBase.getINSTANCE().findAccountIndex(accountnum)).
                        setBalance(x + money);
            } else {
                System.out.println("This account number not found");
            }
        } else {
            System.out.println("There is not enough money");

        }
    }

}
