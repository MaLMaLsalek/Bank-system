package bank.bankuser.client.transaction;

import bank.data.DataBase;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transmission {

    public void transmissionMony(String id, double money, long accountnum) {
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        int accountIndex = DataBase.getINSTANCE().findAccountIndex(accountnum);
        double balance = DataBase.getINSTANCE().getUser().get(x).getBalance();
        double accountBalance = DataBase.getINSTANCE().getUser().get(accountIndex).getBalance();
        if (balance - money > 0) {
            DataBase.getINSTANCE().getUser().get(x).setBalance(balance - money);
            DataBase.getINSTANCE().getUser().get(accountIndex).setBalance(accountBalance + money);
            System.out.println("The operation was successful.");
        } else {
            System.out.println("There is not enough money.");
        }
    }

    public void addTransmissionToHistory(String id, double money, long accountnum) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        int accountIndex = DataBase.getINSTANCE().findAccountIndex(accountnum);
        double balance = DataBase.getINSTANCE().getUser().get(x).getBalance();
        if (balance - money > 0) {
            DataBase.getINSTANCE().getUser().get(x).getHistory()
                    .addFirst("Transmission : " + money + " to " + accountnum + " at : " + currentDate + " " + currentTime);
            DataBase.getINSTANCE().getUser().get(accountIndex).getHistory()
                    .addFirst("receive : " + money + " at : " + currentDate + " " + currentTime);
        }
    }
}