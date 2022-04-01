package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        char ilkHarf= scan.next().charAt(0);
        // charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir
        // String'de index 0'dan baslar
        // E r s i n
        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);






    }

}

