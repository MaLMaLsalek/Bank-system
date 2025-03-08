package bank.cli;

import bank.data.DataBase;

import java.time.Year;

public class Accountnum {

    public long createAccountNum() {
        long x = Year.now().getValue();
        return (x * 100000000 + DataBase.getINSTANCE().getUser().size() );
    }

}
