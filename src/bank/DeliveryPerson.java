package bank;

/**
 * Created by fatemehabdi on 7/5/17.
 */
public class DeliveryPerson extends Employee implements Human {
    BankCashDesk cashDesk=new BankCashDesk();
    public long setBalanceDelivery(long amount){     //ezafe kardane pool be sandogh

        return (cashDesk.setBalance(amount));
    }
    public  long withdrawDelivery(long amount){      //kam kardane pool az sandogh
        return (cashDesk.setBalance(amount));
    }


}
