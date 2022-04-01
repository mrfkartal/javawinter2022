package day30_passByValue;

public class C05_PassByValue {

    // Kalici indirim icin ikinci yontem
    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYuzdesi=10;

        etiketFiyati = kaliciIndirimYap(etiketFiyati,indirimYuzdesi);
        System.out.println("main method'da indirim sonrasi etiket fiyati : " + etiketFiyati);
    }
    public static double kaliciIndirimYap(double etiketFiyati,double indirimYuzdesi){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100 ;
        System.out.println("indirimli fiyat : " + etiketFiyati);
        return etiketFiyati;
    }
}

