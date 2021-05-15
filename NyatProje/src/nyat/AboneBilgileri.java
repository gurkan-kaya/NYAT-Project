package nyat;

public class AboneBilgileri {

    private String adi;
    private String soyadi;
    // email, telefon numarası ve adres alanları zorunlu değil.
    private String email;
    private String telNo;
    private  String adres;


    public AboneBilgileri(AboneBuilder builder) {

        this.adi = builder.adi;
        this.soyadi = builder.soyadi;
        this.email = builder.email;
        this.telNo = builder.telNo;
        this.adres=builder.adres;
    }

    public String getAdi() {
        return adi;
    }
    public String getSoyadi() {
        return soyadi;
    }
    public String getEmail() {
        return email;
    }
    public String getTelNo() {
        return telNo;
    }
    public String getAdres() {
        return telNo;
    }

    @Override
    public String toString() {
        if(this.adi==null)
        {
            this.adi="";
        }
        if(this.soyadi==null)
        {
            this.soyadi="";
        }
        if(this.email==null)
        {
            this.email="";
        }
        if(this.telNo==null)
        {
            this.telNo="";
        }
        if(this.adres==null)
        {
            this.adres="";
        }
        return this.adi+"\n"+this.soyadi+"\n"+this.email+"\n"+this.telNo+"\n"+this.adres+"\n";
    }

    // AboneBilgileri sınıfı içinde bulununan static AboneBuilder sınıfı
    public static class AboneBuilder {

        private String adi;
        private String soyadi;
        private String email;
        private String telNo;
        private String adres;

        public AboneBuilder(String adi, String soyadi) {
            this.adi = adi;
            this.soyadi = soyadi;
        }

        public AboneBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AboneBuilder telNo(String telNo) {
            this.telNo = telNo;
            return this;
        }

        public AboneBuilder adres(String adres) {
            this.adres = adres;
            return this;
        }

        public AboneBilgileri build() {
            return new AboneBilgileri(this);
        }



    }
}
