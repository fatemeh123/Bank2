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
        Gharzolhasane,CurrentAccout,ShortTimeAccount;  //besorate random entekhab mikonam
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

                                                                                //tarikhe eftetahe hesab???????
    }
    public Customar(int id,String name,long balance,String accType){
        this.balance=balance;
        this.id=id;
        this.name=name;

        //tarikhe eftetahe hesab???????
    }
    public Customar(){

    }

    /*sakhtane moshtari dar har rooz beyne 0 ta 100 ta moshtari
    vasamoon misaze ke tedade moshtaria akhare har rooz moshakhas mishe
     */


    public ArrayList<Customar> MakeCustomar(){
        ArrayList<Customar> customarArrayList=new ArrayList<Customar>();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        int a=(int)randomNum/5;                                                    //az har 5 nafar 1 nafar hesabe boland modat mikhad
        int b=(int)randomNum%5;

        for (int i=0;i<a;i++){
            Customar.AccountType newCustomar= Customar.AccountType.getRandom();    //esm va noe hesab be soorate random
            Customar.NameType newName= Customar.NameType.getRandom();
            for (int j=0;j<2;j++){                                                 //1 nafar az 5nafar hesabe boland modat dare
                customarArrayList.add(new Customar(123+i,newName.toString(),1200+(i*100),"LongTimeAccount"));
            }
            for (int k=0;k<4+b;k++){                                               //hade aghal 4 nafar hesabaye dg daran
                customarArrayList.add(new Customar(123+i,newName.toString(),1200+(i*100),newCustomar));
            }
        }
        System.out.println(customarArrayList+"  "+"The number of all day customar is:    "+randomNum);
        return customarArrayList;

    }

}