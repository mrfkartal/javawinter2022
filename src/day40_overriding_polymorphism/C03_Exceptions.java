package day40_overriding_polymorphism;

import java.util.Scanner;
public class C03_Exceptions {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip, bolerek
        // soonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while(kontrol !=2){

            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1= scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yaziniz");
            int sayi2= scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (ArithmeticException e) {

                // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }
            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basin");
            kontrol= scan.nextInt();
        }
        /*
        Sayi2 0 oldugunda sayi1 / 0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu
        Neden kaynaklandigi
        ve hangi satirda olustugu yazar
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:18)

        bunu cozmek icin sayi2'yi if ile kontrol edebiliriz
        if (sayi2==0){
            System.out.println("Sayi / 0 tanimsizdir");
        } else {
            System.out.println("sonuc = " + sayi1 / sayi2);
        }
         Ama bu yontem her sorunda calismaz
         */
    }
}
