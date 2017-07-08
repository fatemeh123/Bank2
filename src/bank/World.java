package bank; /**
 * Created by fatemehabdi on 7/4/17.
 */
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.Random;
import java.lang.String;
import static java.lang.System.*;

import java.util.HashMap;
//package packageForBank ;
//     interface MyPerson {
//
//
//}

public class World {
     static float inDoorTemp;      //havaye dakhelo static tarif mikonim ke har bar tahghir kard meghdaresh dakhelesh bemoone

    public static void main(String[] args){

        //HashMap MyPerson= new HashMap();
        Random rand = new Random();
        int day[]={1,2,3};

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
        UserInterface ui =new UserInterface();
        ui.ShowTime();

//        //moshtari besazim
//
//
//        Customar myCustomar=new Customar();
//        Customar myCustomar1=new Customar();
//        UserInterface showCustomars=new UserInterface();
//        ArrayList<Customar> myCustomarArrayList=new ArrayList<Customar>();
//        ArrayList<Customar> myCustomarArrayList1=new ArrayList<Customar>();     //define static collection
//
//        for(int p=0;p<4;p++) {
//
//            for (int j = 0; j < day.length; j++) {
//
//                myCustomarArrayList=myCustomar.MakeCustomar();
//                showCustomars.ShowCustomars(myCustomarArrayList);
//
//
//            }
//
//        }
//
//
//        System.out.println("the number of customars is"+myCustomarArrayList.size());






    }

}
