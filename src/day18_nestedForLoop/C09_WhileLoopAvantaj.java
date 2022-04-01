package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {


        // kullanicidan istediği kadar sayi giremesini isteyin
        //kullanıcıdan girdiği sayilarin toplami 500'u geceerse
        //artik yeter cok sayi girdin, toplan .... oldu yazsin


        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;

        while (toplam <= 500) {

            System.out.println("lütfen sayi griniz");
            sayi = scan.nextInt();
            toplam += sayi;

        }
        System.out.println("artik yeter cok sayi girdin, toplam : "+toplam+ "oldu ");
    }
}