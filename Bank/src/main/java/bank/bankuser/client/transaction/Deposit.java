package bank.bankuser.client.transaction;

import bank.data.DataBase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Deposit {

    public boolean isMonyNumber(String number) {
        if (number.isEmpty()) {
            return false;
        } else if (number.equals("0")) {
            return false;
        } else {
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public void depositMoney(String id, double mony) {
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        double y = DataBase.getINSTANCE().getUser().get(x).getBalance();
        DataBase.getINSTANCE().getUser().get(x)
                .setBalance(y + mony);
    }

    public void addToHistory(String id, double mony) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        ArrayList<String> y = DataBase.getINSTANCE().getUser().get(x).getHistory();
        DataBase.getINSTANCE().getUser().get(x).getHistory()
                .add("Deposit : " + mony + " at : " + currentDate + " " + currentTime);
//        System.out.println("Deposit : " + mony + " at : " + currentDate + " " + currentTime);
    }
}
