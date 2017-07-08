package bank;
import java.util.Date;


/**
 * Created by fatemehabdi on 7/4/17.
 */
 interface BankAccount{



}
public class Bank extends World {    //eshtbahe

    String owner;
    int ID;
    long balance;
    Date date;
    int temp;
    int height=16;
    int length=25;
    int weidth=3;
    double volume=1200;

//    public Bank(int ID,String owner,long balance){
//        this.ID=ID;
//        this.balance=balance;
//        this.owner=owner;
//    }

//    public enum AccountType{
//        Gharzolhasane,CurrentAccout,ShortTimeAccount,LongTimeAccount
//    }





    public long getBalance(int Id){      // moojoodi
        return balance;

    }
    public long setBalance(int Id, int amount){   //varize pool
        return (balance+=amount);
    }

    public long withdraw(int Id,int amount ){      // daryaft vajh
        return (balance-=amount);

    }
//    public long transfer(, ,long money){
//
//
//    }   // poolo  az Id1 mirize too Id2


    }




