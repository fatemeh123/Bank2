package bank;

/**
 * Created by fatemehabdi on 7/5/17.
 */
public class Cooler extends Objects implements MyObject {

    double  power=500;
    @Override public double PowerTimes(int temp, double volume){


        double idealEnergy;
        double bankEnergy;
        idealEnergy=volume*20;
        bankEnergy=volume*temp;
        double powerTime=(idealEnergy-bankEnergy)/power;  // tedade dafaati ke bayad 500j energy bgiire
        return powerTime;


        }
    public double Makecolder(double powerTime){     // harbar 500 j energy migire

        return powerTime-=power;

    }

    public double OutDoorEffect(int outDoorTemp,float inDoorTemp){   //tasire havaye biroon too dakhel

        inDoorTemp=(float)((outDoorTemp*0.07) +inDoorTemp);
        return inDoorTemp;
    }
}




