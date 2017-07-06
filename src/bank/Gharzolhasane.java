package bank;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by fatemehabdi on 7/4/17.
 */
public class Gharzolhasane  extends Bank implements BankAccount{

    int number;


    public void draw(ArrayList GharzolhasaneCustomer){
        Random rn = new Random();

        number=GharzolhasaneCustomer.size();
        rn.nextInt(number -   1) ;

    }

}
