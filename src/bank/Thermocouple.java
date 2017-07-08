package bank; /**
 * Created by fatemehabdi on 7/4/17.
 */
import java.sql.Array;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Thermocouple  extends Objects{

//****************************************************************************

    public ArrayList<Integer> tempreture(String mySeason){
        Array[] randomNumbersForTemp = new Array[9];
        ArrayList <Integer> outTempList=new ArrayList<Integer>(); //ye araye tarif kardim ke damaye biroono random berizim toosh bad sort kardim
        ArrayList <Integer> outTempList13To24=new ArrayList<Integer>();

        Random random = new Random();


        if(mySeason=="spring"){

            for (int i=1;i<=12;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(5, 25 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList.add(randomNum);
            }

            Collections.sort(outTempList);        // dama haro sort kardim

            for (int i=13;i<=24;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(5, 25 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList13To24.add(randomNum);
            }
            Collections.sort(outTempList13To24, Collections.reverseOrder());    //dama besoorate nozooli sort mishe


        }
        if(mySeason=="summer"){
            for (int i=1;i<=12;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(20, 40 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList.add(randomNum);
            }

            Collections.sort(outTempList);        // dama haro sort kardim

            for (int i=13;i<=24;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(20, 40 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList13To24.add(randomNum);
            }
            Collections.sort(outTempList13To24, Collections.reverseOrder());

        }
        if(mySeason=="fall"){
            for (int i=1;i<=12;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(-5, 20 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                 outTempList.add(randomNum);
            }

            Collections.sort(outTempList);        // dama haro sort kardim

            for (int i=13;i<=24;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(-5, 20 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList13To24.add(randomNum);
            }
            Collections.sort(outTempList13To24, Collections.reverseOrder());
        }
        if(mySeason=="winter"){
            for (int i=1;i<=12;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(-20, 15 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList.add(randomNum);
            }

            Collections.sort(outTempList);        // dama haro sort kardim

            for (int i=13;i<=24;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(-20, 15 + 1); // baraye peyda kardane adade random beyne min=5 o max=25
                outTempList13To24.add(randomNum);
            }
            Collections.sort(outTempList13To24, Collections.reverseOrder());

        }
        outTempList.addAll(outTempList13To24);
        return outTempList;

    }

}
