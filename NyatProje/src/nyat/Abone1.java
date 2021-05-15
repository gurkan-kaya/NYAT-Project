package nyat;

public class Abone1 implements IObserver {

    Builder builder=new Builder();

    @Override
    public void update(String message) {

        System.out.println("Değerli Abonemiz "+builder.abone1.getAdi()+" " + message);
    }
}
