package bank.bankuser.client.transaction;

public class Withdrawal {

    public double withdrawalMoney(double balance, double drawalmoney) {
        if (balance - drawalmoney >= 0){
            return balance - drawalmoney;
        }else {
            System.out.println("There is not enough money");
            return balance;
        }
    }
}
