package bank; /**
 * Created by fatemehabdi on 7/4/17.
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import java.util.HashMap;
//package packageForBank ;
//     interface MyPerson {
//
//
//}

public class World {

    public static void main(String[] args){

        HashMap MyPerson= new HashMap();
        Random rand = new Random();


//        double time[]=new double[23];
//
//        for (int i=0;i<23;i++){
//            time[i]=(i+1);
//        }
//        String season[]={"spring","summer","fall","winter"};
//        int day[]={1,2,3};
        int  randomCustomar = rand.nextInt(30) + 1;        //tedade customer hamoon be soorate random

        ArrayList <Customar> listOfCustomar=new ArrayList<Customar>();

//        for(int i=0;i<randomCustomar;i++){
//            listOfCustomar.add(new bank.Customar(200+i,"fatemeh",2500+(100*i)));
//
//        }
        UserInterface uI =new UserInterface();
        uI.ShowTime();
        //moshtari besazim
        ArrayList<Customar> customarArrayList=new ArrayList<Customar>();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 30 + 1);
        for (int i=0;i<= randomNum;i++){
            Customar.AccountType newCustomar= Customar.AccountType.getRandom();    //esm va noe hesab be soorate random
            Customar.NameType newName= Customar.NameType.getRandom();
            customarArrayList.add(new Customar(123+i,"fatemeh",1200+(i*100),newCustomar));
        }



    }

}
