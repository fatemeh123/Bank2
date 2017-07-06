package bank;

/**
 * Created by fatemehabdi on 7/4/17.
 */
public class LongTermAccount extends DepositeAccount {


    float nerkheSood;



    LongTermAccount(){      //six month 10%
        nerkheSood=(float)0.1;
    }
    LongTermAccount(int Id){    //one year 12%
        nerkheSood=(float)0.12;
    }
    LongTermAccount(float Id){    // two year 14%

        nerkheSood=(float)0.14;
    }
    LongTermAccount(int Id, char a){   // 5 year 16%
        nerkheSood=(float)0.16;
    }
    @Override
    public void MohasebeyeSood(long balance){
        balance=(long)(balance+(balance*nerkheSood));

    }}
