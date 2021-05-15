package nyat;

import java.util.ArrayList;
import java.util.List;

public class Yayimci implements ISubject {

    private List<IObserver> aboneler=new ArrayList<>();



    @Override
    public void ekle(IObserver observer) {

        aboneler.add(observer);
    }

    @Override
    public void kaldir(IObserver observer) {
        aboneler.remove(observer);
    }

    @Override
    public void bildir(String message) {
        for(IObserver observer:aboneler){
            observer.update(message);
        }
    }
}
