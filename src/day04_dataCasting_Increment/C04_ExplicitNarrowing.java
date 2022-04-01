package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;


        double sayi3=sayi1/sayi2; //87.9
        System.out.println(sayi3);

        int sayi4=(int) (sayi1/sayi2);   //87.9
        //değer double variable integer  yani variable daha dar
        //dolayısıyla java bunu otomatik olarak yapmaz
        //sorumluluğu üstlenmemizi ister
        //sag tarafa yazdunugıız (int) sorumluluk bende demek

        System.out.println(sayi4); //87

        int sayi5=140;
        byte sayi6=(byte)sayi5;    //sağ taraftaki deger integer büyüktür > sol taraftaki variable byte dan
        System.out.println(sayi6);  //
    }
}
