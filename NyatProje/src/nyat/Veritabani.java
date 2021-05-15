package nyat;

import java.sql.*;
import java.util.ArrayList;

public class Veritabani {

    ArrayList<String> kAdlari = new ArrayList<String>();
    ArrayList<Integer> kSifreleri = new ArrayList<Integer>();

    public Veritabani()
    {
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NyatDatabase",
                    "postgres", "12345");
            if (conn != null)
                System.out.println("Veritabanına Bağlanıldı.");
            else
                System.out.println("Bağlantı Gerçekleşemedi.");


            String sorgu= "SELECT \"kullaniciAdi\", \"sifre\" FROM \"kullanici\"";


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sorgu);


            conn.close();

            String kullaniciAdi = null;
            int sifre=0;


            while(rs.next())
            {
                kullaniciAdi  = rs.getString("kullaniciadi");
                sifre = rs.getInt("sifre");

                kAdlari.add(kullaniciAdi);
                kSifreleri.add(sifre);

            }

            rs.close();
            stmt.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
    public boolean kullaniciDogrula(String kullaniciAdi, int sifre) throws InterruptedException {
        System.out.println("Doğrulama Yapılıyor Lütfen Bekleyiniz.");
        Thread.sleep(1000);

        for (int i = 0; i < kAdlari.size(); i++) {
            if (kAdlari.get(i).equals(kullaniciAdi)) {
                System.out.println("Kullanıcı Adı Doğrulandı.");
                Thread.sleep(1000);
                if (kSifreleri.get(i).equals(sifre))
                {
                    System.out.println("Şifre Doğrulandı.");
                    Thread.sleep(1000);
                    System.out.println("Kullanıcı Doğrulandı.\n");
                    return true;
                }
                else{
                    System.out.println("Şifre Doğrulanamadı.");
                    System.out.println("Kullanıcı Doğrulaması Başarısız.\n");
                    return false;
                }

            }
            else{
                System.out.println("Kullanıcı Doğrulaması Başarısız.\n");
                return false;
            }
        }
    return false;
    }
}
