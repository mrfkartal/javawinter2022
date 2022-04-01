package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        //kullanıcıdan aldığımız 4 basamaklı bir sayının
        //basamaklarda ki rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen 4 basamaklı bir tam sayi giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplmai=0;

        //1.adim r=0 rt=0 sayi 7532

        rakam=sayi%10;  //2 mocılıs 10 son sayıyı verir
        rakamlarToplmai+=rakam; //2
        sayi/=10;   //753   int olduüunda virgül sonuna bakmaz

        //2.adım r 2 rt 2 sayi 753
        rakam=sayi%10;  //3 mocılıs 10 son sayıyı verir
        rakamlarToplmai+=rakam; //5
        sayi/=10; //75

        //3.adım r=5 rt=5 sayı 75

        rakam=sayi%10;  //5 mocılıs 10 son sayıyı verir
        rakamlarToplmai+=rakam; //10
        sayi/=10;   //7

        rakam=sayi%10;  //0,7 mocılıs 10 son sayıyı verir
        rakamlarToplmai+=rakam; //17
        sayi/=10;   //0

        System.out.println("girdiğiniz sayının rakamlar toplami " + rakamlarToplmai);
    }
}
