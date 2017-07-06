package bank;

/**
 * Created by fatemehabdi on 7/5/17.
 */

public class Heater extends Objects implements MyObject{

    double  power=500;
    @Override public double PowerTimes(int temp, double volume){


        double idealEnergy;
        double bankEnergy;
        idealEnergy=volume*20;
        bankEnergy=volume*temp;
        double powerTime=(bankEnergy-idealEnergy)/power;  // tedade dafaati ke bayad 500j energy bede
        return powerTime;
    }
    public double MakeWarmer(double powerTime){     // harbar 500 j energy mide

        return powerTime+=power;

    }
    public double OutDoorEffect(int outDoorTemp,float inDoorTemp){   //tasire havaye biroon too dakhel
        if (outDoorTemp>0){
            inDoorTemp=(float)((inDoorTemp-outDoorTemp*0.07) );

        }
        if (outDoorTemp<=0){
            inDoorTemp=(float)((inDoorTemp+outDoorTemp*0.07) );

        }
        return inDoorTemp;
    }

}
