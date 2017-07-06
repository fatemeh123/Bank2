package bank;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by fatemehabdi on 7/4/17.
 */
public class Customar {
    private int id;
    private String name;
    private long balance;
    public enum AccountType{
        Gharzolhasane,CurrentAccout,ShortTimeAccount,LongTimeAccount;  //besorate random entekhab mikonam
        public static AccountType getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }

    }
    public enum NameType {
        fatemeh,shima,ali,arman,mohammad,saeid,newsha,farnoosh;
        public static NameType getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }

    }


    public Customar(int id,String name,long balance,AccountType accType){
        this.balance=balance;
        this.id=id;
        this.name=name;

        //tarikhe eftetahe hesab
    }
    public ArrayList<Customar> MakeCustoamr(){
        ArrayList<Customar> customarArrayList=new ArrayList<Customar>();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        for (int i=0;i<= randomNum;i++){
            Customar.AccountType newCustomar= Customar.AccountType.getRandom();    //esm va noe hesab be soorate random
            Customar.NameType newName= Customar.NameType.getRandom();
            Customar myCustomar=new Customar(123+i,"fatemeh",1200+(i*100),newCustomar);
        }
        return customarArrayList;

    }

}