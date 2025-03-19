package bank.bankuser.client;

import bank.data.DataBase;

import java.time.Year;

public class AccountNumber {

    public long createAccountNum() {
        long x = Year.now().getValue();
        return (x * 100000000 + DataBase.getINSTANCE().getUser().size() );
    }

}
