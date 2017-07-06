package bank;

import com.sun.tools.corba.se.idl.constExpr.Positive;

/**
 * Created by fatemehabdi on 7/4/17.
 */
public abstract class Enviornment {

    int temp;
    private double volume= Double.POSITIVE_INFINITY;
    public Enviornment (int temp){
        this.temp=temp;
    }
}
