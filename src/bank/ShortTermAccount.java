package bank;

/**
 * Created by fatemehabdi on 7/4/17.
 */
public class ShortTermAccount extends  DepositeAccount {

    float nerkheSood=(0.06f);
    @Override
    public void MohasebeyeSood(long balance){
        balance=(long)(balance+(balance*nerkheSood));

    }
}
