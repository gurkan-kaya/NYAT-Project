package nyat;

public class Builder {


    AboneBilgileri abone1 = new AboneBilgileri.AboneBuilder("Gürkan", "Kaya")
            .email("gurkan.kaya@ogr.sakarya.edu.tr").build();

    AboneBilgileri abone2 = new AboneBilgileri.AboneBuilder("Eren", "Kaya")
           .email("erenkaya06@gmail.com").telNo("0555 123 45 67").adres("Huzur Mahallesi Mutluluk Sokak Neşe Apartmanı 13/10 Çankaya/Ankara").build();


  public  void yazdir1() throws InterruptedException {
      Thread.sleep(1000);
      System.out.println("1. Abone Bilgileri");
      System.out.print(abone1);
  }

    public  void yazdir2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("2. Abone Bilgileri");
        System.out.print(abone2+"\n\n");
        Thread.sleep(1000);
    }



}
