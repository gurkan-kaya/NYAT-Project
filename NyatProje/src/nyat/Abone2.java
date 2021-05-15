package nyat;

public class Abone2 implements IObserver {

    Builder builder=new Builder();

    @Override
    public void update(String message) {

        System.out.println("Değerli Abonemiz " +builder.abone2.getAdi()+" " + message);
    }
}
