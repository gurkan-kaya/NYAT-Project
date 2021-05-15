package nyat;


import java.util.Random;

public   class SicaklikDegeri {

    static  Random   rand = new Random();
    static int  olcum = rand.nextInt(20)+30;

    public static int SicaklikOlcumu(){

        return olcum;

    }

}
