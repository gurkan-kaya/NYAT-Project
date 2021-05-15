package nyat;

public interface IEyleyici {

    void sogutucuAc() throws InterruptedException;
    void sogutucuKapat() throws InterruptedException;
    void aboneEkle(IObserver abone);

}
