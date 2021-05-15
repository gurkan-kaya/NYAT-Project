package nyat;

import java.util.*;

public class AnaIslemPlatformu {

    IEyleyici eyleyici;
    ISicaklikAlgilayici algilayici;
    ISicaklikAlgilayici algilayici2;

  public AnaIslemPlatformu()
  {
      //Dependency Inversion

      ISicaklik celcius=new SicaklikCelcius();
      ISicaklik fahrenheit=new SicaklikFahrenheit();

      algilayici=new SicaklikAlgilayici(celcius);
      algilayici2=new SicaklikAlgilayici(fahrenheit);

      eyleyici=new Eyleyici();

      eyleyici.aboneEkle(new Abone1());
      eyleyici.aboneEkle(new Abone2());


  }

    public  void algilayiciyaIstekGonder() throws InterruptedException {
       algilayici.sicaklikOku();
       algilayici2.sicaklikOku();

    }

    public  void eyleyiciyeIstekGonder(String istek) throws InterruptedException {

        if(istek.equals("acmaIstegi")){

            eyleyici.sogutucuAc();
        }

       else if(istek.equals("kapatmaIstegi")){

           eyleyici.sogutucuKapat();

        }

    }


}
