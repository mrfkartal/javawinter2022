package day04_dataCasting_Increment;

import jdk.swing.interop.SwingInterOpUtils;

public class C03_Casting {
    public static void main(String[] args) {


        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2); //2

        sayi2=3;
        System.out.println(sayi1/sayi2);  //2.6666

        sayi1=22;
        System.out.println(sayi1/sayi2); ///7.3333

        //JAVA İKİ İNTEGER SAYIYI BİRBİRİNE BÖLERSE SONUCUDA İNTEGER OLARAK VERİR.
        //SONUC OLARAK VİRGÜLDEN SONRA SOMRA SAYILARI DİREK SİLER.

        sayi1=4786;
        sayi2=10;
        System.out.println(sayi1/sayi2); //478 virgülden sonrasını siler

        sayi1=478;
        sayi2=10;
        System.out.println(sayi1/sayi2);  ///47

        sayi1=47;
        sayi2=10;
        System.out.println(sayi1/sayi2);   //4

        sayi1=4;
        sayi2=10;
        System.out.println(sayi1/sayi2);   //0

        sayi1=4895;
        double sayi3=10;
        //sayi1=sayi1/sayi3; //İKİ FARKLI DATA TÜRÜNÜ İŞLEME KOYDUĞUMUZDA
                            // JAVA KÜCÜK OLAN DATA TURU ICIN AUTOWİDENİNG YAPAR
                            //BU İŞLEM İÇİN SAYİ1/SAYİ3 İŞLEMİN SONUCUNU DOUBLE KABUL EDERİ

        System.out.println(sayi1/sayi3);

        System.out.println(sayi3/sayi1);

    }
}
