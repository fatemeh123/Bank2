package bank;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class UserInterface {

    public void ShowTime(){

        double time[]=new double[23];
        for (int i=0;i<23;i++){
                time[i]=(i+1);
        }
        String season[]={"spring","summer","fall","winter"};
        int day[]={1,2,3};
        ArrayList <Integer> springTempList=new ArrayList<Integer>();
        ArrayList <Integer> summerTempList=new ArrayList<Integer>();
        ArrayList <Integer> fallTempList=new ArrayList<Integer>();
        ArrayList <Integer> winterTempList=new ArrayList<Integer>();
        int[] ret1 = new int[12];
        for (int i=0; i < ret1.length; i++)
        {
            ret1[i] = springTempList.get(i).intValue();
        }
        int[] ret2 = new int[12];
        for (int i=0; i < ret2.length; i++)
        {
            ret2[i] = summerTempList.get(i).intValue();
        }
        int[] ret3 = new int[12];
        for (int i=0; i < ret3.length; i++)
        {
            ret3[i] = fallTempList.get(i).intValue();
        }
        int[] ret4 = new int[12];
        for (int i=0; i < ret4.length; i++)
        {
            ret4[i] = winterTempList.get(i).intValue();
        }

        Thermocouple temp=new Thermocouple();
        springTempList=temp.tempreture("spring");     //arrayListe temp haye spring ro  gereftim
        summerTempList=temp.tempreture("summer");
        fallTempList=temp.tempreture("fall");
        winterTempList=temp.tempreture("winter");
        Boss myBoss = new Boss();
        Cashier myCashier =new Cashier();
        float indoorTemp=ThreadLocalRandom.current().nextInt(5, 30 + 1);


        for(int p=0;p< season.length;p++){

            for(int j=0;j< day.length;j++){

                for(int k=0;k< time.length;k++){
                    if (k==8){
                        System.out.println("*************************************");
                        myBoss.BossOpenTheDoor();
                        System.out.println("*************************************");

                    }
                    if (k==14){
                        System.out.println("*************************************");
                        myBoss.BossCloseTheDoor();
                        System.out.println("*************************************");

                    }
                    if (k==22){                                                          // balance kole bank
                        System.out.println("*************************************");
                        System.out.println(myCashier.CashierTask());
                        System.out.println("*************************************");

                    }

                    /*agar p=1 bashe spring e
                    ret1[hour]=temp
                    har bar indoorTempo moghayese mikone ba tempe ideal

                      */
                    if(p==1){    //p=1 mishe spring
                        System.out.println("season is"+"  "+ret1[p]+"  "+"day is"+"  "+day[j]+"  "+"time is"+"  "+time[k]);
                        if (indoorTemp<20){
                            System.out.println("bank.Heater is on");
                            Heater heater=new Heater();
                            double powerT=heater.PowerTimes(ret1[p],1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT);
                            heater.OutDoorEffect(ret1[p],indoorTemp);


                        }
                        else  if(indoorTemp>25){
                            System.out.println("bank.Cooler is on");
                            Cooler cooler=new Cooler();
                            double powerT=cooler.PowerTimes(ret1[p],1200);
                            cooler.Makecolder(powerT);
                            cooler.OutDoorEffect(ret1[p],indoorTemp);

                        }else if(indoorTemp==20){
                            System.out.println("--------------------Temp is ok--------------------");
                        }

                    }

                    //**********************************************************************************

                    if(p==2){    //p=1 mishe summer
                        System.out.println("season is"+"  "+ret2[p]+"  "+"day is"+"  "+day[j]+"  "+"time is"+"  "+time[k]);
                        if (indoorTemp<20){
                            System.out.println("bank.Heater is on");
                            Heater heater=new Heater();
                            double powerT=heater.PowerTimes(ret2[p],1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT);
                            heater.OutDoorEffect(ret2[p],indoorTemp);


                        }
                        else  if(indoorTemp>25){
                            System.out.println("bank.Cooler is on");
                            Cooler cooler=new Cooler();
                            double powerT=cooler.PowerTimes(ret2[p],1200);
                            cooler.Makecolder(powerT);
                            cooler.OutDoorEffect(ret2[p],indoorTemp);

                        }else if(indoorTemp==20){
                            System.out.println("--------------------Temp is ok--------------------");
                        }


                    }

                    //**********************************************************************************

                    if(p==3){    //p=1 mishe fall
                        System.out.println("season is"+"  "+ret3[p]+"  "+"day is"+"  "+day[j]+"  "+"time is"+"  "+time[k]);
                        if (indoorTemp<20){
                            System.out.println("bank.Heater is on");
                            Heater heater=new Heater();
                            double powerT=heater.PowerTimes(ret3[p],1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT);
                            heater.OutDoorEffect(ret3[p],indoorTemp);


                        }
                        else  if(indoorTemp>25){
                            System.out.println("bank.Cooler is on");
                            Cooler cooler=new Cooler();
                            double powerT=cooler.PowerTimes(ret3[p],1200);
                            cooler.Makecolder(powerT);
                            cooler.OutDoorEffect(ret3[p],indoorTemp);

                        }else if(indoorTemp==20){
                            System.out.println("--------------------Temp is ok--------------------");
                        }


                    }
                    //**********************************************************************************

                    if(p==4){    //p=1 mishe winter
                        System.out.println("season is"+"  "+ret4[p]+"  "+"day is"+"  "+day[j]+"  "+"time is"+"  "+time[k]);

                        if (indoorTemp<20){
                            System.out.println("bank.Heater is on");
                            Heater heater=new Heater();
                            double powerT=heater.PowerTimes(ret4[p],1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT);
                            heater.OutDoorEffect(ret4[p],indoorTemp);


                        }
                        else  if(indoorTemp>25){
                            System.out.println("bank.Cooler is on");
                            Cooler cooler=new Cooler();
                            double powerT=cooler.PowerTimes(ret4[p],1200);
                            cooler.Makecolder(powerT);
                            cooler.OutDoorEffect(ret4[p],indoorTemp);

                        }else if(indoorTemp==20){
                            System.out.println("--------------------Temp is ok--------------------");
                        }

                    }



                    }



                }

//            ArrayList<bank.Customar> myNewCustomar=new ArrayList<bank.Customar>();
//            bank.Customar aaa;
//            aaa.MakeCustoamr();

            }


        }

        }

