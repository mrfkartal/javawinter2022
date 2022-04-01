package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim ve soyisim bilgisini alıp
        //bütün harflari yıldız * yapalım

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isim ve soy isiminizi yazınız");
        String isimSoyisim=scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));

        System.out.println(isimSoyisim.replaceAll("\\s","x"));

    }
}
