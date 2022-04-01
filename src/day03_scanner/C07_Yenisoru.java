package day03_scanner;

import java.util.Scanner;

public class C07_Yenisoru {

    public static void main(String[] args) {
       // Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        // prizmanin hacmini hesaplayip yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen dikdörgenler prizmasının uzun kenarını söyleyin");
        int uzunkenar = scan.nextInt();
        System.out.println("lütfen dikdörtgenler prizmasının kısa kenarını söyleyin");
        int kisakenar = scan.nextInt();
        System.out.println("lütfen dikdörtgenler prizmasının yükseliğini söyleyin");
        int yukseklik = scan.nextInt();

        System.out.println("dikdörtgenler prizmasının hacmi :" + (uzunkenar * kisakenar * yukseklik));



    }
}
