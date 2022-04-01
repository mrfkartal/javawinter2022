package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        //Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayi yaziniz");
        int sayi = scan.nextInt();    //4 basamaklı sayi dısşında yazmalarına karşı bir data da girceğiz

        if (sayi<1000 || sayi>9999){  // istenmeyen durumu yaziyoruz
            System.out.println("Lutfen 4 basamakli sayi giriniz");
        } else if (sayi%5==0){ // 4 basamakli ve sayi 5'e tam bolunuyor
            if (sayi%10==0){ // 4 basamakli, 5 ile bolunebilen ve son rakami 0 olan
                System.out.println("5’e bölünen çift sayı");
            } else{ // 4 basamakli, 5 ile bolunebilen ve son rakami 0 olmayan
                System.out.println("5'e bölünen tek sayı");
            }
        } else { // 4 basamakli ve 5'e bolunemiyor
            System.out.println("Tekrar deneyin");

        }

        }

    }

