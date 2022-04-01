package day15_methodCreation;

import java.util.Scanner;

import static day15_methodCreation.C04.dortHarfiTersineCevir;
import static day15_methodCreation.C04.ucHarfiTersineCevir;

public class C03_MethodCreation {
    public static void main(String[] args) {

        //kullanıcıdan bir kelime isteyin
        //eger kelime 3 harften kısa ise "kelime cok kısa" yazdırın
        //eger kelime 3,4 veya 5 harfli ise harf sayisini  ve kelimenin tersten
        //yazılıısnı yazdırın
        //eger 5 harften uzunsa "kelime çok uzun" yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime çok kısa");
        }else if (harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("kelime çok uzun");
        }


    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(3,4)+
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }
    //1-method olusturmak için methodun adini yazariz
    //2-methoda giderken götürmem gerek  varialbe varsa bunu methoda eklemeliyim
    

}

