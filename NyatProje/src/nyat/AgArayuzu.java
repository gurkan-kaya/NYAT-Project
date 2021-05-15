package nyat;

import java.util.Scanner;

public class AgArayuzu  {

    AnaIslemPlatformu anaIslem=new AnaIslemPlatformu();
    Veritabani vt=new Veritabani();
    Builder builder=new Builder();
    String kullaniciAdi;
    int sifre;
    boolean giris = false;
    private static final int SICAKLIKOLCUMU = 1;
    private static final int SOGUTUCUAC = 2;
    private static final int SOGUTUCUKAPAT = 3;
    private static final int ABONEBILGILERI = 4;
    private static final int CIKISYAP = 5;

    public void kullaniciBilgiAl() throws InterruptedException {
        do{
            Scanner reader = new Scanner(System.in);
            System.out.print("Kullanici Adi: ");
            kullaniciAdi = reader.next();
            System.out.print("Sifre: ");
            sifre = reader.nextInt();

            if (vt.kullaniciDogrula(kullaniciAdi, sifre)) {

                giris = true;
                this.islemSecimi();
            }
        }while(!giris);
    }

    public void islemSecimi() throws InterruptedException {
        int secim;
        do {
            secim=this.anaMenuListele();
            switch (secim){
                case SICAKLIKOLCUMU:
                    this.sicaklikGonder(SICAKLIKOLCUMU);
                    break;
                case SOGUTUCUAC:
                    this.sogutucuAcmaIstegi();
                    break;
                case SOGUTUCUKAPAT:
                    this.sogutucuKapatmaIstegi();
                    break;
                case ABONEBILGILERI:
                    this.aboneBilgiGoruntule();
                    break;
                case CIKISYAP:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("1-2-3-4-5 sayılarından birini tuşlayınız.");
                    break;
            }
        }while(secim!=5);
    }

    private int anaMenuListele(){
        Scanner rd = new Scanner(System.in);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("1-SICAKLIK GÖRÜNTÜLE");
        System.out.println("2-SOĞUTUCUYU AÇ");
        System.out.println("3-SOĞUTUCUYU KAPAT");
        System.out.println("4-ABONE BİLGİLERİNİ GÖRÜNTÜLE");
        System.out.println("5-ÇIKIŞ YAP");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*");

        return rd.nextInt() ;
    }

    public void sicaklikGonder(int secim) throws InterruptedException {
        anaIslem.algilayiciyaIstekGonder();
    }

    public void sogutucuAcmaIstegi() throws InterruptedException {
        anaIslem.eyleyiciyeIstekGonder("acmaIstegi");
    }

    public void sogutucuKapatmaIstegi() throws InterruptedException {
        anaIslem.eyleyiciyeIstekGonder("kapatmaIstegi");
    }

    public void aboneBilgiGoruntule() throws InterruptedException {
        builder.yazdir1();
        System.out.println();
        builder.yazdir2();
    }

}
