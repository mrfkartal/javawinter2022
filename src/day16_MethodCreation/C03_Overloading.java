package day16_MethodCreation;

public class C03_Overloading {

    public static void main(String[] args) {

        //verilen iki sayiyi toplayıp yazıdran bir method olusturalım
        
        int sayi1=10;
        int sayi2=20;
        
        ikiSayiTopla(sayi1, sayi2);

        //iki double sayinin toplaminin yazdiran bir method olusturalim

        double sayi3=15.2;
        double sayi4=10.3;

        ikiSayiTopla(sayi3 , sayi4);

        //eğer variable olusturmadan  direk sayileri yazarak method call yaparsam

        ikiSayiTopla(15,25);    //integer toplam veriri
        ikiSayiTopla(10.1,12.3); // double toplam verir

        //bir integer ile bir double toplamini yazdiran bir method olusturalim

        int sayi5=3;

        double sayi6=3.2;
        ikiSayiTopla(sayi5,sayi6);

    }

    private static void ikiSayiTopla(double sayi3, double sayi4) {

        System.out.println("iki double toplami : " + (sayi3 + sayi4));
    }

    private static void ikiSayiTopla(int sayi1, int sayi2) {

        System.out.println("iki integer toplamı : " +(sayi1+sayi2));
    }
}
