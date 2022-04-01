package day06_concanation_Operatörs;

public class C02_MantikOperatörleri {
    public static void main(String[] args) {

        System.out.println(5 + 2 == 8);   //false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc1);

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;

        System.out.println(sonuc2);  //false

        boolean sonuc3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;    // tek and ile yazınca daa ynı ifadeui

                                                                    // veriyor aradaki fark
                                                                    //&& ile & arasındaki fark

        System.out.println(sonuc3);

        int sayi3 = 15;   //sayi3 ün 10 ile  20 arasında olduğunu true diyerek yazdıralım


        System.out.println(10 < sayi3 && sayi3 < 20);


        int sayi4 = 5;

        //sayi4 ün 10 ile 20 arasında olmadığını truie diyerek döndürelim

        System.out.println(sayi4 < 10 || sayi4 > 20);


    }
}
