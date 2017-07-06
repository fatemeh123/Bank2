package bank;

/**
 * Created by fatemehabdi on 7/5/17.
 */
public class BankCashDesk extends Objects implements MyObject {


    long totalBalance;
    public BankCashDesk(long Balance){    // ezafe shodane pool dar soorate variz
        totalBalance+=Balance;
    }
    public BankCashDesk(){

    }



    public long getBalance(){      // daraeie bank
        System.out.println("Bank balance is:"+totalBalance);
        return totalBalance;

    }
    public long setBalance( long amount){   //varize pool
        totalBalance+=amount;
        return totalBalance;

    }

    public long withdraw(int amount ){      // daryaft vajh
        totalBalance-=amount;
        return totalBalance;
    }

}
