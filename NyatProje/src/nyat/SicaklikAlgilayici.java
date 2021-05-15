package nyat;

import java.util.List;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {


    private ISicaklik _sicaklik;

    public SicaklikAlgilayici(ISicaklik sicaklik) {
        this._sicaklik = sicaklik;
    }


    public void sicaklikOku() throws InterruptedException {

            _sicaklik.sicaklikAlgila();

    }

}
