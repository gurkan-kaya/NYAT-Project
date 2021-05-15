package nyat;

public interface ISubject {
    void ekle(IObserver observer);
    void kaldir(IObserver observer);
    void bildir(String message);
}
