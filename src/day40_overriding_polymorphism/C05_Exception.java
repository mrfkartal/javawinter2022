package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;
public class C05_Exception {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
        // toplam 500'u gecerse programi bitirsin veya
        // kullanici bitirmek istediginde Q'ya basmalidir

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        do{
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz" +
                    " \n bitirmek icin Q'ya basiniz");
            int sayi= 0;
            try {
                sayi = scan.nextInt();
                toplam+=sayi;
            } catch (InputMismatchException e) {
                String hataliGiris=scan.next();
                if (hataliGiris.equalsIgnoreCase( "q"));

                break;
                } {//else olacak
                  System.out.println("hatali giris");
            }




        }while (toplam<500);
        System.out.println("girdiginiz sayilarin toplami :" + toplam);
    }


}
