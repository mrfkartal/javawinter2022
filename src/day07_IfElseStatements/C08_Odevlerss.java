package day07_IfElseStatements;

import java.util.Scanner;

public class C08_Odevlerss {
    public static void main(String[] args) {

        // kullanıcıdan gun ısımlerınden bırınız ilk harfını ısteyin
        //o harfle baslayan isimlerini yazdır
        //orn ilkHrf=P output="pazar pazartesı veya persembe"
        //ilk harf=S ise cıktı salı

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen herhangi bir günün ilk harfini yazın");
        char ilkHarf=scan.next().toLowerCase().charAt(0);

        if (ilkHarf=='p'){
            System.out.println("pazar, pazartesi ve persembe");
        } else if (ilkHarf=='s') {
            System.out.println("sali");
        } else if (ilkHarf=='c'){
            System.out.println("carsamba, cuma ve cumartesi");
        } else{
            System.out.println("lütfen haftanın gecerli gün ismini giriniz");
        }


    }
}
