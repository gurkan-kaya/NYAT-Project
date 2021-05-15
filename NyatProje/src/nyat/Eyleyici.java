package nyat;

public class Eyleyici implements IEyleyici {

    Yayimci yayimci=new Yayimci();
    Builder builder=new Builder();

    @Override
    public void sogutucuAc() throws InterruptedException {
        System.out.println("Soğutucu Açılıyor");
        Thread.sleep(1000);
        System.out.println("SOĞUTUCU AÇIK!\n");
        Thread.sleep(1000);

        yayimci.bildir("Soğutucu Durumu: Açık");
        System.out.println();
        Thread.sleep(1000);
    }

    @Override
    public void sogutucuKapat() throws InterruptedException {
        System.out.println("Soğutucu Kapatılıyor");
        Thread.sleep(1000);
        System.out.println("SOĞUTUCU KAPALI!\n");
        Thread.sleep(1000);

        yayimci.bildir("Soğutucu Durumu: Kapalı");
        System.out.println();
        Thread.sleep(1000);
    }

    public void aboneEkle(IObserver abone){
        yayimci.ekle(abone);
    }
}
