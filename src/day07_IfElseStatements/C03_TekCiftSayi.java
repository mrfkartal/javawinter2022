package day07_IfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);  //kullanıcıdan bir dönüş almak istediğimizde Scanner.. kullanırız.
        System.out.println("lütfen bir sayi giriniz"); //kullanıcıya soru sormak istediğimiz de sout a yazarız.
        int sayi=scan.nextInt();

        if (sayi%2==0) {  //sayının çift mi tek mi olduğunu bilmek için data sayi%2 yi sıfıra eşitlemek lazım
            // modulus (macılıs) da gördük. şart cümlesi demek istiyor ki verilen sayının 2 ile
            //kalan sıfıra eşitir. eşit ise true diyecektir.
            System.out.println("girilen sayı cift sayidır");
        }
        if (sayi%2!=0) { // girilen sayınin iki ile bölümünden kalan sıfıra eşit değilse tektir
            //şart cümlesi kalan sayı sıfıra eşit değildir. dmek istiyor.

            System.out.println("girilen sayi tek sayıdır");
        }

            //bir sayı ya tektir ya çifttir. o zaman tek olmasıni iki if ile değilde if else ile
            //tek statement yapmak daha güzel olur
            // ==========if else ile çözümü=================

        if (sayi%2==0){
            System.out.println("girdiğiniz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}

