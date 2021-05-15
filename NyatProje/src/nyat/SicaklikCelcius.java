package nyat;

public class SicaklikCelcius implements ISicaklik {

    @Override
    public void sicaklikAlgila() throws InterruptedException {

        System.out.println("Sıcaklık Değeri: " +  SicaklikDegeri.SicaklikOlcumu() + "  Celcius Derece");
        Thread.sleep(1000);
    }
}
