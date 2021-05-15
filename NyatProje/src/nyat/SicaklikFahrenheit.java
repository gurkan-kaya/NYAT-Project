package nyat;

public class SicaklikFahrenheit  implements ISicaklik {

    @Override
    public void sicaklikAlgila() throws InterruptedException {

        System.out.println("Sıcaklık Değeri: " + (int) (SicaklikDegeri.SicaklikOlcumu()*1.8 + 32) + "  Fahrenheit Derece\n");
        Thread.sleep(1000);
    }
}
