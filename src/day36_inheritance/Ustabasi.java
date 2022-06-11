package day36_inheritance;

public class Ustabasi extends Isci {


    public static void main(String[] args) {

        Ustabasi ustabasi = new Ustabasi();

        ustabasi.saatUcreti = 15;
        ustabasi.isim = "murat";
        ustabasi.soyisim = "gokcek";
        ustabasi.maas = ustabasi.maasHesapla();
        ustabasi.statu="isci";
        ustabasi.isciStatu="ustabasi";
        System.out.println(ustabasi);


    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
