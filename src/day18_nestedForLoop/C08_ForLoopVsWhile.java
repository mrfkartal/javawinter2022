package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhile {
    public static void main(String[] args) {

        //kullanıcıdan toplamak istediği sayilari alın
        //ve kullanici 0'a basıncaya kadar devam edin
        // kullanıcı 0'a bastığında
        //girdiği tüm sayilarin toplamıni yazdirin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;

    //   for (int i = 1; i <100000 ; i++) {
    //       System.out.println("lütfen sayi griniz");
    //       sayi=scan.nextInt();
    //       if (sayi==0){
    //           break;
    //       }else{
    //           toplam+=sayi;
    //       }
    //   }
    //   System.out.println(toplam);


        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.println("lütfen sayi griniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);
        //baslangic, bitis ve degişim degerleri net olan durumlarda for loop daha avantajlıdır
        //ama adim sayisi bellli olmayan, durumlarda while loop daha avantajlidir

    }
}
