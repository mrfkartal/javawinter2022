package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime 3 harften kısa ise "kelime cok kısa" yazdırın
        //eger kelime 3,4 veya 5 harfli ise harf sayisini  ve kelimenin tersten
        //yazılıısnı yazdırın
        //eger 5 harften uzunsa "kelime çok uzun" yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scan.next();
        String tersKelime="";

        if (kelime.length()<3){
            System.out.println("kelime cok kısa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else if (kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else{
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }
            System.out.println("girdiğiniz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazılışı : " + tersKelime);
        }else{
            System.out.println("kelime çok uzun");
        }



    }
}
