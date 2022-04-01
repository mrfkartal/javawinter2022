package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // soru 6 kullanıcıdan ismini ve soyisimin alıp aralarında bir bosluk olusturarak
        //asagıdaki sekilde  yazdırın
        // Isim - soyisim : Omer Kartal

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi yazınız");

        String isim=scan.nextLine();
        System.out.println("lütfen soy isminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Isim - soyisim : " + isim + " " + soyisim);
    }
}
