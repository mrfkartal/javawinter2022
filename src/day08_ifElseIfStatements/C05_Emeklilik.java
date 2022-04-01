package day08_ifElseIfStatements;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {

        //eger calısan kadınsa 60 yasından büyük olduğunda emekli olabilir,
        //calısan erkekse 65 yasından büyükse emekli olabilir.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız" + "\nkadın için K, \nErkek çi E harfi giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasınızı yazın");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("lütfen girdiğiniz yas degerini kontrol edin");
            } else if (yas<60) {
                System.out.println("emekli olamazsın Daha " + (60 - yas) + " yıl calısman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E'){
            if (yas<0 || yas>120){
                System.out.println("lütfen girdiğiniz yas degerini kontrol edin");
            } else if (yas<65){
                System.out.println("emekli olamazsın Daha " + (65-yas) + " yıl calısman gerekir");
            } else{
                System.out.println("emekli olabilirsin");
            }
        } else{
                System.out.println("lütfen cinsiyet için gecerli bir harf giriniz");
            }
        }
    }