package bank.bankuser.client.transaction;

import bank.data.DataBase;

import javax.xml.crypto.Data;

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

    public void depositmoney(String id, double mony) {
        int x = DataBase.getINSTANCE().findAccountIndexWithId(id);
        double y = DataBase.getINSTANCE().getUser().get(x).getBalance();
        DataBase.getINSTANCE().getUser().get(x)
                .setBalance(y + mony);
    }
}
