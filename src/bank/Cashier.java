package bank;

import bank.BankCashDesk;

/**
 * Created by fatemehabdi on 7/5/17.
 */
public class Cashier extends Employee {
    public long CashierTask(){
        BankCashDesk desk=new BankCashDesk();
        long balance= desk.getBalance();
        return  balance;
    }


}
