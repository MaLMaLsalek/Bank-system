package bank.bankuser.client.transaction;

import bank.data.DataBase;

import java.time.LocalDate;
import java.time.LocalTime;

public class Withdrawal {

    public void withdrawalMoney(String id, double drawalmoney) {
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        double y = DataBase.getINSTANCE().getUser().get(x).getBalance();
        if (y - drawalmoney > 0) {
            DataBase.getINSTANCE().getUser().get(x).setBalance(y - drawalmoney);
            System.out.println("The operation was successful.");
        } else {
            System.out.println("There is not enough money.");
        }
    }

    public void addWithdrawalToHistory(String id, double mony) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        double y = DataBase.getINSTANCE().getUser().get(x).getBalance();
        if (y - mony > 0) {
            DataBase.getINSTANCE().getUser().get(x).getHistory()
                    .addFirst("Withdrawal : " + mony + " at : " + currentDate + " " + currentTime);
        }
    }
}