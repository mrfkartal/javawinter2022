package day04_dataCasting_Increment;

public class C06_Odev {
    public static void main(String[] args) {
        //Soru 1 ) byte veri tipinde bir degisken olusturun,
        // short,int,float ve double data tiplerinde birer degisken olusturup adim adim
        // widening yapin ve yazdirin

        byte sayi1=30;
        System.out.println(sayi1);   //30

        short sayi2=sayi1;
        System.out.println(sayi2);   //30

        double sayi3=sayi2;
        System.out.println(sayi3);     //30.0

        System.out.println(sayi3/sayi1);  //1.0

        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin

        int number1=180;
        byte number2=(byte) number1;
        System.out.println(number2);

        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin

        float x=12.3f;
        System.out.println(x);

        // Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin

        double borda=255.36;
        int kaporta=(int) borda;
        System.out.println(kaporta);
        kaporta=255;
        byte karine= (byte) kaporta;
        System.out.println(kaporta);

        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin

        int k=64;
        double l=4.0;
        System.out.println(k/l);

        //Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim

        long sayi5=200;
        int sayi6= (int) sayi5;

        System.out.println(sayi6/sayi5);



    }
}
