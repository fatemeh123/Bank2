package bank;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class UserInterface {


    public ArrayList ShowCustomars(ArrayList<Customar> cust) {    // neveshtane foreach baraye namayeshe moshtaria

        for (Customar c1:cust) {                                  //tamame moshtariaro baramoon print mikone
            System.out.println(c1);

        }

        return cust;
    }
    public void ShowTime( ){   //da


            double time[]=new double[24];                   //chera double???????????????????
        for (int i=0;i<24;i++){
                time[i]=(i+1);
        }
        String season[]={"spring","summer","fall","winter"};
        int day[]={1,2,3};
        ArrayList <Integer> springTempList=new ArrayList<Integer>();
        Thermocouple thermocouple=new Thermocouple();
        String spring="spring";
//        springTempList=thermocouple.tempreture("spring");
        springTempList.addAll(thermocouple.tempreture(spring));



        ArrayList <Integer> summerTempList=new ArrayList<Integer>();
        String summer="summer";
//        summerTempList=thermocouple.tempreture("summer");
        summerTempList.addAll(thermocouple.tempreture(summer));

        ArrayList <Integer> fallTempList=new ArrayList<Integer>();
        String fall="fall";
//        fallTempList=thermocouple.tempreture("fall");
        fallTempList.addAll(thermocouple.tempreture(fall));

        ArrayList <Integer> winterTempList=new ArrayList<Integer>();
        String winter="winter";
//        winterTempList=thermocouple.tempreture("winter");
        winterTempList.addAll(thermocouple.tempreture(winter));

        int[] ret1 = new int[24];                //temp har faslo be tartib ret1=spring ret2=summer ...
        for (int i=0; i < 24; i++)
        {
            ret1[i] = springTempList.get(i).intValue(); //springTemList por nashode, sizesh 0 hast!!!!
        }
        System.out.println("spring temp list"+ret1);

        int[] ret2 = new int[24];
        for (int i=0; i < 24; i++)
        {
            ret2[i] = summerTempList.get(i).intValue();
        }
        int[] ret3 = new int[24];
        for (int i=0; i < 24; i++)
        {
            ret3[i] = fallTempList.get(i).intValue();
        }
        int[] ret4 = new int[24];
        for (int i=0; i<24; i++)
        {
            ret4[i] = winterTempList.get(i).intValue();
        }

//        Thermocouple temp=new Thermocouple();
//        springTempList=temp.tempreture("spring");     //arrayListe temp haye spring ro  gereftim
//        summerTempList=temp.tempreture("summer");
//        fallTempList=temp.tempreture("fall");
//        winterTempList=temp.tempreture("winter");
        Boss myBoss = new Boss();
        Cashier myCashier =new Cashier();

        double indoorTemp=ThreadLocalRandom.current().nextInt(5, 30 + 1);    //havaye dakhele bank ro faghat yebar migirim

        for(int p=0;p< season.length;p++){

            for(int j=0;j< day.length;j++){

                for(int k=0;k< time.length;k++) {
                    if (k == 8) {
                        System.out.println("*************************************");
                        myBoss.BossOpenTheDoor();
                        System.out.println("*************************************");

                    }
                    else if (k == 14) {
                        System.out.println("*************************************");
                        myBoss.BossCloseTheDoor();
                        System.out.println("*************************************");

                    }
                    else if (k == 22) {                                                          // balance kole bank
                        System.out.println("*************************************");
                        System.out.println(myCashier.CashierTask());
                        System.out.println("*************************************");

                    }

                    /*agar p=0 bashe spring e
                    ret1[hour]=temp
                    har bar indoorTempo moghayese mikone ba tempe ideal

                      */
                    if (p == 0) {    //p=0 mishe spring
                        System.out.println("season is" + "  spring  " + "day is" + "  " + day[j] + "  " + "time is" + "  " + time[k]);
                        if (indoorTemp < 20) {
                            System.out.println("bank.Heater is on");
                            Heater heater = new Heater();
                            double powerT = heater.PowerTimes(springTempList.get(k).intValue(), 1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            indoorTemp=heater.OutDoorEffect(springTempList.get(k).intValue(), indoorTemp);            // bad az inke outdooeEffecto seda zadim bayad indoorTemp ro update konim

                            indoorTemp=heater.MakeWarmer(powerT,indoorTemp);                               //update kardan indoor effect
                            System.out.println("in door temp is :"+ ((int) indoorTemp));

                        } else if (indoorTemp > 25) {
                            System.out.println("bank.Cooler is on");
                            Cooler cooler = new Cooler();
                            double powerT = cooler.PowerTimes(springTempList.get(k).intValue(), 1200);
                            indoorTemp=cooler.OutDoorEffect(springTempList.get(k).intValue(), indoorTemp);

                            indoorTemp=cooler.Makecolder(powerT,indoorTemp);
                            System.out.println("in door temp is :"+ ((int) indoorTemp));


                        } else if (indoorTemp == 20) {
                            System.out.println("--------------------Temp is ok--------------------");
                            System.out.println("in door temp is :"+ ((int) indoorTemp));

                        }

                    }

                    //**********************************************************************************

                    if (p == 1) {    //p=1 mishe summer

                        System.out.println("season is" + "  " + "summer" + "  " + "day is" + "  " + day[j] + "  " + "time is" + "  " + time[k]);

                        if (indoorTemp < 20) {
                            System.out.println("bank.Heater is on");
                            Heater heater = new Heater();
                            double powerT = heater.PowerTimes(summerTempList.get(k).intValue(), 1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT,indoorTemp);
                            heater.OutDoorEffect(summerTempList.get(k).intValue(), ((int) indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));


                        } else if (indoorTemp > 25) {
                            System.out.println("bank.Cooler is on");
                            Cooler cooler = new Cooler();
                            double powerT = cooler.PowerTimes(summerTempList.get(k).intValue(), 1200);
                            cooler.Makecolder(powerT,indoorTemp);
                            cooler.OutDoorEffect(summerTempList.get(k).intValue(), ((int)indoorTemp));
                            System.out.println("in door temp is :"+indoorTemp);


                        } else if (indoorTemp == 20) {
                            System.out.println("--------------------Temp is ok--------------------");                            System.out.println("in door temp is :"+ ((int) indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));

                        }


                    }

                    //**********************************************************************************

                    if (p == 2) {    //p=1 mishe fall
                        System.out.println("season is" + "  " + "fall" + "  " + "day is" + "  " + day[j] + "  " + "time is" + "  " + time[k]);
                        if (indoorTemp < 20) {
                            System.out.println("bank.Heater is on");
                            Heater heater = new Heater();
                            double powerT = heater.PowerTimes(fallTempList.get(k).intValue(), 1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT,indoorTemp);
                            heater.OutDoorEffect(fallTempList.get(k).intValue(), ((int)indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));



                        } else if (indoorTemp > 25) {
                            System.out.println("bank.Cooler is on");
                            Cooler cooler = new Cooler();
                            double powerT = cooler.PowerTimes(fallTempList.get(k).intValue(), 1200);
                            cooler.Makecolder(powerT,indoorTemp);
                            cooler.OutDoorEffect(fallTempList.get(k).intValue(), ((int) indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));


                        } else if (indoorTemp == 20) {
                            System.out.println("--------------------Temp is ok--------------------");
                            System.out.println("in door temp is :"+ ((int) indoorTemp));

                        }


                    }
                    //**********************************************************************************

                    if (p == 3) {    //p=1 mishe winter
                        System.out.println("season is" + "  " +"winter" + "  " + "day is" + "  " + day[j] + "  " + "time is" + "  " + time[k]);

                        if (indoorTemp < 20) {
                            System.out.println("bank.Heater is on");
                            Heater heater = new Heater();
                            double powerT = heater.PowerTimes(winterTempList.get(k).intValue(), 1200);     //tedade dafaaati ke bayad behesh 500j energy bedim
                            heater.MakeWarmer(powerT,indoorTemp);
                            heater.OutDoorEffect(winterTempList.get(k).intValue(), ((int) indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));



                        } else if (indoorTemp > 25) {
                            System.out.println("bank.Cooler is on");
                            Cooler cooler = new Cooler();
                            double powerT = cooler.PowerTimes(winterTempList.get(k).intValue(), 1200);
                            cooler.Makecolder(powerT,indoorTemp);
                            cooler.OutDoorEffect(winterTempList.get(k).intValue(), ((int) indoorTemp));
                            System.out.println("in door temp is :"+ ((int) indoorTemp));


                        } else if (indoorTemp == 20) {
                            System.out.println("--------------------Temp is ok--------------------");
                            System.out.println("in door temp is :"+ ((int) indoorTemp));

                        }

                    }


                }



                }





        }


        }

        }

//hich ja poresh nakardin, faghat new kardin
//ye object dorost shode ba toole sefr ke hichi toosh nist
//ok?
//bale mikhastim meghdare random behesh bedm ke ghablan tarif kardim vali alan motevaje shodim ke sedash nakardim
//ok
//oon 3 ta khate avale errora chi bood asan ye jaei bood ke ma naneveshtim
//oona marboot mishod be piaadehsaazie khode array list, library haye khode javaas

//chikaaarsh bayad bokonim oonaro?
//shoma ba oo/
//na kaar nadaashte baashid. hamoon jaee ke marboot be khodetoon hast ro dorost konid, hamash dorost mishe
//moshkel hal shod? bebandam yaa baazam soal daarid?
//faght errora soalamoon bood . alan tanha moshkelesh ine ke ret ha khalie
//khob poresh konid dg, afarin dokhtaraaye khoob
// :D mamnoon
//mikhastam begam inja enghadr chat nakonid, yeki jedi jedi payaam daad :))
// felan
//mersi :D khoda hafez